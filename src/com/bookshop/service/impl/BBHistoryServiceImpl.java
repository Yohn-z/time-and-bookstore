package com.bookshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshop.mapper.TsjyHisMapper;
import com.bookshop.pojo.po.LibTsjy;
import com.bookshop.pojo.po.LibTsjyExample;
import com.bookshop.pojo.po.TsjyHis;
import com.bookshop.pojo.po.TsjyHisExample;
import com.bookshop.result.ReturnResult;
import com.bookshop.service.BBHistoryService;
@Service
public class BBHistoryServiceImpl implements BBHistoryService{

	@Autowired
	private TsjyHisMapper tsjyHisMapper;
	
	@Override
	public ReturnResult getAllBBHList() throws Exception {
		List<TsjyHis> tshislist = tsjyHisMapper.selectByExample(null);
		return ReturnResult.success(tshislist);
	}

	@Override
	public ReturnResult findBBHBytsjyId(Integer tsjyId) throws Exception {
		TsjyHis tsjyHis = tsjyHisMapper.selectByPrimaryKey(tsjyId);
		return ReturnResult.success(tsjyHis);
	}

	@Override
	public ReturnResult findBBHBytsId(Integer tsId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReturnResult findBBHByuId(Integer uId) throws Exception {
		
		TsjyHisExample tsjyHisExample = new TsjyHisExample();
		TsjyHisExample.Criteria criteria = tsjyHisExample.createCriteria();
		criteria.andUIdEqualTo(uId);
		List<TsjyHis> TsjyHislist = tsjyHisMapper.selectByExample(tsjyHisExample);
		return ReturnResult.success(TsjyHislist);
	}

	@Override
	public ReturnResult insertBBH(TsjyHis tsjyHis) throws Exception {
		if(tsjyHisMapper.selectByPrimaryKey(tsjyHis.getTsjyId())!=null) {
			ReturnResult.error("0", "已经存在该单号历史");
		}
		tsjyHisMapper.insert(tsjyHis);
		return ReturnResult.success();
	}

	@Override
	public ReturnResult deleteBBH(TsjyHis tsjyHis) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReturnResult updateBBH(TsjyHis tsjyHis) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
