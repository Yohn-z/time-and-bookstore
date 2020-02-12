package com.bookshop.usercontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookshop.pojo.po.LibSkzt;
import com.bookshop.pojo.po.LibTs;
import com.bookshop.pojo.po.LibTslb;
import com.bookshop.pojo.po.LibUsers;
import com.bookshop.pojo.vo.LibTsCustom;
import com.bookshop.pojo.vo.StringTs;
import com.bookshop.result.ReturnResult;
import com.bookshop.service.BookService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/user/userbook")
public class UBookController {
	@Autowired
	private BookService bookService;
	
	//查找图书列表,以及图书状态和图书类别数据
	@RequestMapping("/findtslist")
	public ReturnResult getAll(
			@RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo,//当前页码
			@RequestParam(required = true, defaultValue = "5",value="pageSize") Integer pageSize//每页显示记录数
			
			) throws Exception{
		 PageHelper.startPage(pageNo, pageSize);
		 
		 List<LibTsCustom> list = bookService.getLibTsCustomList();
		 PageInfo<LibTsCustom> pageInfo=new PageInfo<LibTsCustom>(list);
		 List<LibSkzt> ztlist = bookService.getLibSkztList();
		 List<LibTslb> lblist = bookService.getLibTslbList();
		 Map map = new HashMap(); 
		 map.put("list", pageInfo);
		 map.put("ztlist", ztlist);
		 map.put("lblist", lblist);
		 return ReturnResult.success(pageInfo.getTotal(),map);
	}
	
	//插入
	@RequestMapping("/insertts")
	public ReturnResult insertLibTs(@RequestBody LibTs libTs) throws Exception{
		
		
		
		if(bookService.findLibTsBytsid(libTs.getTsId())!=null) {
			return ReturnResult.error("0", "已经存在该书刊编号");
		}
		libTs.setTsOnnum(libTs.getTsSum());
		/*if(bookService.findLibTsBytsid(libTs.getTsId())!=null) {
			return false;
		}*/
		bookService.insertLibTs(libTs);
		return ReturnResult.success();
	}
	
	//删除书刊
	@RequestMapping("/deletets")
	public ReturnResult deleteLibTs(@RequestBody StringTs stringTs) throws Exception{
		
		int id = Integer.parseInt(stringTs.getTsId());
		if(bookService.findAdminclass(1)!=1) {
			return ReturnResult.error("-1", "权限不足");
		}
		if(!bookService.deleteLibTs(id)) {
			return ReturnResult.error("0", "删除异常：数据库不存在该书或书已被借阅零售~");
		}
		return ReturnResult.success();
		
	}
	
	//修改请求数据
	@RequestMapping("/updatetsinfo")
	public ReturnResult updateLibTsInfo(@RequestBody StringTs stringTs) throws Exception{
		
		
		int id = Integer.parseInt(stringTs.getTsId());
		LibTs libTs = bookService.findLibTsBytsid(id);
		if(libTs==null)
		{
			return ReturnResult.error("0", "该书不存在");
		}
		
		 return ReturnResult.success(libTs);
	
	}
	//修改数据
	@RequestMapping("/updatets")
	public ReturnResult updateLibTsInfo(@RequestBody LibTs libTs) throws Exception{
		if(libTs.getTsOnnum()-libTs.getTsSum()>0) {
			return ReturnResult.error("0", "在册数量不能大于总量");
		}
		bookService.updateLibTs(libTs);
		
		return ReturnResult.success();
	}
	//请求查询数据
	@RequestMapping("/getfindlist")
	public ReturnResult findLibTsByName(@RequestBody LibTs libTs) throws Exception{
			
			
		 PageHelper.startPage(1, 7);
		 if(libTs.getTsName()=="") {
			 List<LibTsCustom> list = bookService.getLibTsCustomList();
			 PageInfo<LibTsCustom> pageInfo=new PageInfo<LibTsCustom>(list);
			 return ReturnResult.success(pageInfo);
		 }
		 else {
			 List<LibTs> libTsByTsName = bookService.getLibTsByTsName(libTs.getTsName());
			 PageInfo<LibTs> pageInfo=new PageInfo<LibTs>(libTsByTsName);
			 return ReturnResult.success(pageInfo);
		 }
			 
			
	}
	

}
