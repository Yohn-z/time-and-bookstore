package com.bookshop.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookshop.pojo.po.LibTs;
import com.bookshop.pojo.po.LibUsers;
import com.bookshop.pojo.vo.LibTsCustom;
import com.bookshop.result.ReturnResult;
import com.bookshop.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/admin/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/userlist")
	public ReturnResult pageList(
			@RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo,//当前页码
			@RequestParam(required = true, defaultValue = "5",value="pageSize") Integer pageSize//每页显示记录数
			)throws Exception{
	   
	    //分页查询
	    PageHelper.startPage(pageNo, pageSize);
	    List<LibUsers> allLibUsersList = userService.getAllLibUsersList();
	    PageInfo<LibUsers> pageInfo=new PageInfo<LibUsers>(allLibUsersList);
	    
	    return ReturnResult.success(pageInfo.getTotal(), pageInfo);
	}
	
	@RequestMapping("/insertuser")
	public ReturnResult insertUser(@RequestBody LibUsers libUsers) throws Exception{
		String msg = userService.insertLibUsers(libUsers);
		if(msg.equals("已经存在该用户"))
		{
			return ReturnResult.error("0", msg);
		}
		return ReturnResult.error("1", msg);
		
	}
	
	@RequestMapping("/deleteuser")
	public ReturnResult deleteUser(@RequestBody LibUsers libUsers)throws Exception{
		String msg = userService.deleteLibUser(libUsers);
		return ReturnResult.error("1", msg);
		
	}
	@RequestMapping("/updateinfo")
	public ReturnResult updateUserinfo(@RequestBody LibUsers libUsers) throws Exception{
		LibUsers libu = userService.findLibUserByuId(libUsers.getuId());
		if(libu == null) {
			return ReturnResult.error("0", "该用户不存在");
		}
		
		return ReturnResult.success(libu);
		
	}
	@RequestMapping("/updateuser")
	public ReturnResult updateUser(@RequestBody LibUsers libUsers) throws Exception{
		String msg = userService.updateLibUser(libUsers);
		
		return ReturnResult.error("1", msg);
		
	}
	
	@RequestMapping("/getuserlist")
	public ReturnResult getpageList(@RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo,
			Integer uId,String uName)throws Exception{
		LibUsers libUsers = new LibUsers();
		libUsers.setuId(uId);
		libUsers.setuName(uName);
		System.out.println(libUsers.getuId()+"------------------------"+libUsers.getuName());
	    //分页查询
	    PageHelper.startPage(pageNo, 7);
		if(libUsers.getuId() == null && libUsers.getuName().equals("")) {
			 List<LibUsers> list = userService.getAllLibUsersList();
			 PageInfo<LibUsers> pageInfo=new PageInfo<LibUsers>(list);
			 return ReturnResult.success(pageInfo);
		}
		else if(libUsers.getuId() == null){
			 
			 List<LibUsers> list = userService.findLibUserByuName(libUsers.getuName());
			 PageInfo<LibUsers> pageInfo=new PageInfo<LibUsers>(list);
			 return ReturnResult.success(pageInfo);
		}
		else if(libUsers.getuName().equals("")){
			 LibUsers findLibUserByuId = userService.findLibUserByuId(libUsers.getuId());
			 List list = new ArrayList<LibUsers>();
			 list.add(findLibUserByuId);
			 PageInfo<LibUsers> pageInfo=new PageInfo<LibUsers>(list);
			 return ReturnResult.success(pageInfo);
		}
		else {
			 List<LibUsers> list = userService.findLibUserByNameanduId(libUsers.getuId(), libUsers.getuName());
			 PageInfo<LibUsers> pageInfo=new PageInfo<LibUsers>(list);
			 return ReturnResult.success(pageInfo);
		}
	}
	

}
