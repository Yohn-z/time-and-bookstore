package com.bookshop.service;

import java.util.List;

import com.bookshop.pojo.po.LibSkzt;
import com.bookshop.pojo.po.LibTs;
import com.bookshop.pojo.po.LibTsjy;
import com.bookshop.pojo.po.LibTslb;
import com.bookshop.pojo.vo.LibTsCustom;
import com.bookshop.pojo.vo.StringTs;


public interface BookService {
	
/*	//根据条件查询用户信息
	public List<SysuserCustom> findSysuserList(SysuserQueryVo sysuserQueryVo) throws Exception;
	//根据条件查询列表总数
	public int findSysuserCount(SysuserQueryVo sysuserQueryVo) throws Exception;*/
	//根据条件查询图书信息
	public LibTs findLibTsBytsid(Integer tsId)throws Exception;
	public List<LibTsCustom> getLibTsCustomList()throws Exception;
	public List<LibTs> getLibTsByTsName(String name)throws Exception;
	
	//插入数据
	public void insertLibTs(LibTs libTs) throws Exception;
	//查询书刊状态和书刊类别
	public List<LibSkzt> getLibSkztList() throws Exception;
	public List<LibTslb> getLibTslbList() throws Exception;
	//根据主键删除书刊
	public Boolean deleteLibTs(Integer tsId)throws Exception;
	//查询权限
	public int findAdminclass(Integer adminId)throws Exception;
	//修改数据
	public String updateLibTs(LibTs libTs)throws Exception;
	

}
