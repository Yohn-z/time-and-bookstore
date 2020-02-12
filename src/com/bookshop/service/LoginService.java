package com.bookshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookshop.pojo.po.Admin;


public interface LoginService {

	//查询管理员表
	public List<Admin> getAdminList() throws Exception; 
	public Admin findAdminByAdminname(String user) throws Exception;
	
}
