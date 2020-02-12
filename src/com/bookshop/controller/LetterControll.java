package com.bookshop.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookshop.pojo.po.LibLetter;
import com.bookshop.result.ReturnResult;
import com.bookshop.service.LetterService;

@RestController
@RequestMapping("/admin/letter")
public class LetterControll {

	@Autowired
	LetterService letterService;
	
	@RequestMapping("/getAllbyuser")
	public ReturnResult getAllbyuser(
			@RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo
			) {
		return letterService.getAllbyuser(pageNo);
	}
	@RequestMapping("/deleteLetterByid")
	public ReturnResult deleteLetterByid(@RequestBody LibLetter libLetter) {
		return letterService.deleteLetterByid(libLetter.getlId());
	}
	@RequestMapping("/insertletter")
	public ReturnResult insertletter(@RequestBody LibLetter libLetter) {
		libLetter.setlFuser("系统通知");
		return letterService.insertletter(libLetter);
	}
/*	@RequestMapping("/findLetterbyuser")
	public ReturnResult findLetterbyuser(HttpSession session) {
		return letterService.findLetterbyuser(session);
	}*/
	@RequestMapping("/lettermsg")
	public ReturnResult lettermsg(@RequestBody LibLetter libLetter) {
		return letterService.findLetterInfobyId(libLetter.getlId());
	}
	
}
