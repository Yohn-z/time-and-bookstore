package com.bookshop.usercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookshop.pojo.po.LibLetter;
import com.bookshop.result.ReturnResult;
import com.bookshop.service.LetterService;

@RestController
@RequestMapping("/letter")
public class GMsgControll {

	@Autowired
	LetterService letterService;
	
	@RequestMapping("/insertletter")
	public ReturnResult insertletter(@RequestBody LibLetter libLetter) {
		System.out.println("-------------"+libLetter.getlFuser().toString());
		return letterService.insertletter(libLetter);
	}
}
