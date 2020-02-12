package com.bookshop.usercontroller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookshop.pojo.po.LibLetter;
import com.bookshop.pojo.po.LibUsers;
import com.bookshop.result.ReturnResult;
import com.bookshop.service.LetterService;

@RestController
@RequestMapping("/user/letter")
public class ULetterControll {

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
	public ReturnResult insertletter(@RequestBody LibLetter libLetter,HttpSession session) {
		LibUsers activelibUsers = (LibUsers) session.getAttribute("activelibUsers");
		libLetter.setlFuser(activelibUsers.getuName());
		return letterService.insertletter(libLetter);
	}
	@RequestMapping("/findLetterbyuser")
	public ReturnResult findLetterbyuser(HttpSession session,@RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo) {
		return letterService.findLetterbyuser(session,pageNo);
	}
	@RequestMapping("/lettermsg")
	public ReturnResult lettermsg(@RequestBody LibLetter libLetter) {
		return letterService.findLetterInfobyId(libLetter.getlId());
	}
	
}
