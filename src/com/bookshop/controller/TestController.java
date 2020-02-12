package com.bookshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookshop.pojo.po.LibTs;
import com.bookshop.pojo.vo.LibTsCustom;
import com.bookshop.service.BookService;

@RestController
@RequestMapping("/admin/test")
public class TestController {

	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/findtslist")
	public List<LibTsCustom> getAll() throws Exception{
		return bookService.getLibTsCustomList();
	}
	@RequestMapping("/insertts")
	public Boolean insertLibTs(LibTs libTs) throws Exception{
		libTs.setSkztId(1);
		libTs.setTsAuthor("asdas");
		libTs.setTsDetail("dasnjaksf");
		libTs.setTslbName("asdasda");
		libTs.setTsOnnum(12);
		libTs.setTsSum(12);
		libTs.setTslbName("计算机");
		
		/*if(bookService.findLibTsBytsid(libTs.getTsId())!=null) {
			return false;
		}*/
		bookService.insertLibTs(libTs);
		return true;
	}
	
}
