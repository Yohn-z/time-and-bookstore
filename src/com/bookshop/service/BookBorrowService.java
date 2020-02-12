package com.bookshop.service;

import java.util.List;

import com.bookshop.pojo.po.LibTsjy;
import com.bookshop.pojo.po.LibUsers;
import com.bookshop.pojo.po.TsjyHis;
import com.bookshop.pojo.vo.LibTsjyCustom;

public interface BookBorrowService {
	//查询所有数据
	public List<LibTsjy> getAllBBList()throws Exception;
	//查询状态为借出的列表
	public List<LibTsjy> getBBListbyJyzt(Integer jyztId) throws Exception;

	//根据主键查询数据库书刊
	public LibTsjy findBBBytsjyId(Integer tsjyId) throws Exception;
	//
	public List<LibTsjy> findBBBytsId(Integer tsId)throws Exception;
	//查
	public List<LibTsjyCustom> findBBByuId(Integer uId)throws Exception;
	public List<LibTsjyCustom> findBYByuId(Integer uId)throws Exception;
	
	//新建借阅
	public Boolean insertBB(LibTsjy libTsjy) throws Exception;
	//书刊归还
	public Boolean deleteBB(int tdjyId) throws Exception;
	//修改图书
	public Boolean updateBB(LibTsjy libTsjy) throws Exception;

}
