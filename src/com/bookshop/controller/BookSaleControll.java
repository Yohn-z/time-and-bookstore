package com.bookshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookshop.mapper.LibTsjyMapper;
import com.bookshop.pojo.po.LibTsls;
import com.bookshop.pojo.po.LibUsers;
import com.bookshop.result.ReturnResult;
import com.bookshop.service.BookSaleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/admin/sale")
public class BookSaleControll {
	@Autowired
	private BookSaleService bookSaleService;
	
	@RequestMapping("/lslist")
	public ReturnResult pageList(
			@RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo,//当前页码
			@RequestParam(required = true, defaultValue = "5",value="pageSize") Integer pageSize//每页显示记录数
			)throws Exception{
	   
	    //分页查询
	    PageHelper.startPage(pageNo, pageSize);
	    List<LibTsls> alltslsList = bookSaleService.getAlltslsList();
	    PageInfo<LibTsls> pageInfo=new PageInfo<LibTsls>(alltslsList);
	    
	    return ReturnResult.success(pageInfo.getTotal(), pageInfo);
	}
	
	@RequestMapping("/insertls")
	public ReturnResult insertUser(@RequestBody LibTsls libTsls) throws Exception{
		return bookSaleService.insertTsls(libTsls);
	}
	
	@RequestMapping("/deletels")
	public ReturnResult deleteUser(@RequestBody LibTsls libTsls)throws Exception{
		return bookSaleService.deleteTsls(libTsls.getTslsId());
	}

}
