package com.bookshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshop.mapper.LibTsjyMapper;
import com.bookshop.mapper.LibTsjyMapperCustom;
import com.bookshop.pojo.po.Admin;
import com.bookshop.pojo.po.AdminExample;
import com.bookshop.pojo.po.LibTsjy;
import com.bookshop.pojo.po.LibTsjyExample;
import com.bookshop.pojo.po.TsjyHis;
import com.bookshop.pojo.vo.LibTsjyCustom;
import com.bookshop.service.BookBorrowService;

@Service
public class BookBorrowServiceImpl implements BookBorrowService{

	@Autowired
	private LibTsjyMapper libTsjyMapper;
	@Autowired
	private LibTsjyMapperCustom libTsjyMapperCustom;
	
	@Override
	public List<LibTsjy> getAllBBList() throws Exception {
		List<LibTsjy> list = libTsjyMapper.selectByExample(null);
		return list;
	}

	@Override
	public LibTsjy findBBBytsjyId(Integer tsjyId) throws Exception {
		LibTsjy libTsjy = libTsjyMapper.selectByPrimaryKey(tsjyId);
		return libTsjy;
	}

	//根据图书id查询谁借了这本书
	@Override
	public List<LibTsjy> findBBBytsId(Integer tsId) throws Exception {
		
		LibTsjyExample libTsjyExample = new LibTsjyExample();
		LibTsjyExample.Criteria criteria = libTsjyExample.createCriteria();
		criteria.andTsIdEqualTo(tsId);
		List<LibTsjy> libtsjylist = libTsjyMapper.selectByExample(libTsjyExample);
		
		return libtsjylist;
	}

	//根据用户查询借了几本书
	@Override
	public List<LibTsjyCustom> findBBByuId(Integer uId) throws Exception {
	
		List<LibTsjyCustom> libtsjyjclist = libTsjyMapperCustom.getLibTsjyCustomjcListByuId(uId);
		
		return libtsjyjclist;
	}
	@Override
	public List<LibTsjyCustom> findBYByuId(Integer uId) throws Exception {
	
		List<LibTsjyCustom> libtsjyyylist = libTsjyMapperCustom.getLibTsjyCustomyyListByuId(uId);
		
		return libtsjyyylist;
	}

	@Override
	public Boolean insertBB(LibTsjy libTsjy) throws Exception {
		if(this.findBBBytsjyId(libTsjy.getTsjyId())==null) {
			libTsjyMapper.insert(libTsjy);
			return true;
		}
		else {
			return false;
		}
		
	
		
		
	}

	@Override
	public Boolean deleteBB(int tdjyId) throws Exception {
		if(this.findBBBytsjyId(tdjyId)==null) {
			
			return false;
		}
		else {
			libTsjyMapper.deleteByPrimaryKey(tdjyId);
			return true;
		}
	}

	@Override
	public Boolean updateBB(LibTsjy libTsjy) throws Exception {
        if(this.findBBBytsjyId(libTsjy.getTsjyId())==null) {
			
			return false;
		}
		else {
			libTsjyMapper.updateByPrimaryKey(libTsjy);
			return true;
		}

	}

	@Override
	public List<LibTsjy> getBBListbyJyzt(Integer jyztId) throws Exception {
		LibTsjyExample libTsjyExample = new LibTsjyExample();
		LibTsjyExample.Criteria criteria = libTsjyExample.createCriteria();
		criteria.andJyztIdEqualTo(jyztId);
		List<LibTsjy> libtsjylist = libTsjyMapper.selectByExample(libTsjyExample);
		
		return libtsjylist;
	}
	

}
