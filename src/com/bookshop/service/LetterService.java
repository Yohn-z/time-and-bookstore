package com.bookshop.service;

import javax.servlet.http.HttpSession;

import com.bookshop.pojo.po.LibLetter;
import com.bookshop.result.ReturnResult;

public interface LetterService {
	public ReturnResult getAllbyuser(Integer pageNo);
	public ReturnResult deleteLetterByid(Integer id);
	public ReturnResult insertletter(LibLetter libLetter);
	public ReturnResult findLetterbyuser(HttpSession session,Integer pageNo);
	public ReturnResult findLetterInfobyId(Integer id);
}
