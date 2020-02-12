package com.bookshop.service;

import java.util.List;

import com.bookshop.pojo.po.LibTsjy;
import com.bookshop.pojo.po.TsjyHis;
import com.bookshop.result.ReturnResult;

public interface BBHistoryService {

	//查询所有数据
	public ReturnResult getAllBBHList()throws Exception;
	//根据主键查询书刊借阅 
	public ReturnResult findBBHBytsjyId(Integer tsjyId) throws Exception;
	//
	public ReturnResult findBBHBytsId(Integer tsId)throws Exception;
	//查
	public ReturnResult findBBHByuId(Integer uId)throws Exception;
	//新建借阅
	public ReturnResult insertBBH(TsjyHis tsjyHis) throws Exception;
	//书刊归还
	public ReturnResult deleteBBH(TsjyHis tsjyHis) throws Exception;
	//修改图书
	public ReturnResult updateBBH(TsjyHis tsjyHis) throws Exception;
}
