package com.bookshop.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshop.mapper.LibLetterMapper;
import com.bookshop.pojo.po.LibLetter;
import com.bookshop.pojo.po.LibLetterExample;
import com.bookshop.pojo.po.LibUsers;
import com.bookshop.result.ReturnResult;
import com.bookshop.service.LetterService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class LetterServiceImpl implements LetterService{

	@Autowired
	LibLetterMapper libLetterMapper;
	
	@Override
	public ReturnResult findLetterInfobyId(Integer id) {
		LibLetter selectByPrimaryKey = libLetterMapper.selectByPrimaryKey(id);
		return ReturnResult.success(selectByPrimaryKey);
	}
	
	@Override
	public ReturnResult getAllbyuser(Integer pageNo) {
		System.out.println("---------------"+pageNo);
		LibLetterExample libLetterExample = new LibLetterExample();
		LibLetterExample.Criteria cr = libLetterExample.createCriteria();
		cr.andLZtEqualTo(2);
		PageHelper.startPage(pageNo, 7); 
		List<LibLetter> selectByExample = libLetterMapper.selectByExample(libLetterExample);
        PageInfo<LibLetter> pageInfo=new PageInfo<LibLetter>(selectByExample);
		
		return ReturnResult.success(pageInfo);
	}

	@Override
	public ReturnResult deleteLetterByid(Integer id) {
		LibLetter selectByPrimaryKey = libLetterMapper.selectByPrimaryKey(id);
		if(selectByPrimaryKey == null) {
			ReturnResult.error("0", "该消息不存在");
		}
		
		libLetterMapper.deleteByPrimaryKey(id);
		
		return ReturnResult.success("1", "删除成功", null);
	}

	@Override
	public ReturnResult insertletter(LibLetter libLetter) {
		//libLetter.setlZt(1);
		
		libLetterMapper.insertSelective(libLetter);
		return ReturnResult.success("1", "发送成功", null);
	}

	@Override
	public ReturnResult findLetterbyuser(HttpSession session,Integer pageNo) {
		LibUsers activelibUsers = (LibUsers)session.getAttribute("activelibUsers");
		LibLetterExample ex = new LibLetterExample();
		LibLetterExample.Criteria cr = ex.createCriteria();
		System.out.println("---------"+activelibUsers.getuId()+"----------"+pageNo);
		//cr.andLZtEqualTo(1);
		cr.andLWhoEqualTo(activelibUsers.getuId());
		PageHelper.startPage(pageNo, 7); 
		List<com.bookshop.pojo.po.LibLetter> selectByExample = libLetterMapper.selectByExample(ex);
		PageInfo<LibLetter> pageInfo=new PageInfo<LibLetter>(selectByExample);
		return ReturnResult.success(pageInfo);
	}

}
