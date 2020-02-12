package com.bookshop.service;

import java.util.List;

import com.bookshop.pojo.po.LibTsls;
import com.bookshop.pojo.po.TsjyHis;
import com.bookshop.result.ReturnResult;

public interface BookSaleService {

    //查询所有数据
	public List<LibTsls> getAlltslsList()throws Exception;
	//根据主键查询书刊零售 
	public ReturnResult findTslsBytslsId(Integer tslsId) throws Exception;
	//查询指定书刊被哪些用户购买
	public ReturnResult findTslsBytsId(Integer tsId)throws Exception;
	//查寻指定用户购买的书籍
	public ReturnResult findTslsByuId(Integer uId)throws Exception;
	//新建零售
	public ReturnResult insertTsls(LibTsls libTsls) throws Exception;
	//删除零售记录
	public ReturnResult deleteTsls(Integer tslsId) throws Exception;
	//修改零售记录，记录不可被修改，或者修改记录需要校验账户权限
	public ReturnResult updateTsls(LibTsls libTsls) throws Exception;
	
}
