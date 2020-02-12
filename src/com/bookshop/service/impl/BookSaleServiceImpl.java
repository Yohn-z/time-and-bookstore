package com.bookshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshop.mapper.LibTsjyMapper;
import com.bookshop.mapper.LibTslsMapper;
import com.bookshop.pojo.po.LibTsls;
import com.bookshop.result.ReturnResult;
import com.bookshop.service.BookSaleService;

@Service
public class BookSaleServiceImpl implements BookSaleService{

	@Autowired
	private LibTslsMapper libTslsMapper;
	
	@Override
	public List<LibTsls> getAlltslsList() throws Exception {
		List<LibTsls> libTslslist = libTslsMapper.selectByExample(null);
		return libTslslist;
	}

	@Override
	public ReturnResult findTslsBytslsId(Integer tslsId) throws Exception {
		LibTsls libTsls = libTslsMapper.selectByPrimaryKey(tslsId);
		return ReturnResult.success(libTsls);
	}

	@Override
	public ReturnResult findTslsBytsId(Integer tsId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReturnResult findTslsByuId(Integer uId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReturnResult insertTsls(LibTsls libTsls) throws Exception {
		//验证该零售单号是否存在
		if(libTslsMapper.selectByPrimaryKey(libTsls.getTslsId())!=null) {
			return ReturnResult.error("0","该单号已经存在");
		}
		libTslsMapper.insert(libTsls);
		return ReturnResult.success();
	}

	@Override
	public ReturnResult deleteTsls(Integer tslsId) throws Exception {
		if(libTslsMapper.selectByPrimaryKey(tslsId)==null) {
			return ReturnResult.error("0","该单号不存在");
		}
		libTslsMapper.deleteByPrimaryKey(tslsId);
		return ReturnResult.success();
	}

	@Override
	public ReturnResult updateTsls(LibTsls libTsls) throws Exception {
		if(libTslsMapper.selectByPrimaryKey(libTsls.getTslsId())!=null) {
			return ReturnResult.error("0","该单号不存在");
		}
		libTslsMapper.updateByPrimaryKey(libTsls);
		return null;
	}

}
