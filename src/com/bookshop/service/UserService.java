package com.bookshop.service;

import java.util.List;

import com.bookshop.pojo.po.LibSkzt;
import com.bookshop.pojo.po.LibTs;
import com.bookshop.pojo.po.LibUsers;
import com.bookshop.result.ReturnResult;

public interface UserService {
	//查询所有数据
	public List<LibUsers> getAllLibUsersList()throws Exception;
	//根据主键查询数据库
	public LibUsers findLibUserByuId(Integer uId) throws Exception;
	//根据用户名查询
	public List<LibUsers> findLibUserByuName(String uName) throws Exception;
	//根据主键和用户名查询
	public List<LibUsers> findLibUserByNameanduId(Integer uId,String uName) throws Exception;
	//插入用户
	public String insertLibUsers(LibUsers libUsers) throws Exception;
	//删除图书
	public String deleteLibUser(LibUsers libUsers) throws Exception;
	//修改图书
	public String updateLibUser(LibUsers libUsers) throws Exception;
	//统计查询男女人数
	public ReturnResult countLibUserSex()throws Exception;
	

}
