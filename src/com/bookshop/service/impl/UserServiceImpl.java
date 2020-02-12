package com.bookshop.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshop.mapper.LibUsersMapper;
import com.bookshop.pojo.po.LibTs;
import com.bookshop.pojo.po.LibTsjy;
import com.bookshop.pojo.po.LibTsjyExample;
import com.bookshop.pojo.po.LibUsers;
import com.bookshop.pojo.po.LibUsersExample;
import com.bookshop.result.ReturnResult;
import com.bookshop.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private LibUsersMapper libUsersMapper;
	
	@Override
	public List<LibUsers> getAllLibUsersList() throws Exception {
		List<LibUsers> libUsersList = libUsersMapper.selectByExample(null);
		return libUsersList;
	}

	@Override
	public LibUsers findLibUserByuId(Integer uId) throws Exception {
		LibUsers selectByPrimaryKey = libUsersMapper.selectByPrimaryKey(uId);
		return selectByPrimaryKey;
	}

	@Override
	public String insertLibUsers(LibUsers libUsers) throws Exception {
		if(this.findLibUserByuId(libUsers.getuId())!=null) {
			return "已经存在该用户";
		}
		libUsersMapper.insert(libUsers);
		return "登记成功";
	}

	@Override
	public String deleteLibUser(LibUsers libUsers) throws Exception {
		if(this.findLibUserByuId(libUsers.getuId())==null) {
			return "该用户不存在";
		}
		libUsersMapper.deleteByPrimaryKey(libUsers.getuId());
		return "删除成功";
	}

	@Override
	public String updateLibUser(LibUsers libUsers) throws Exception {
		// TODO Auto-generated method stub
		libUsersMapper.updateByPrimaryKey(libUsers);
		return "修改成功";
	}

	@Override
	public ReturnResult countLibUserSex() throws Exception {
		
		LibUsersExample libUsersExample = new LibUsersExample(); 
		LibUsersExample.Criteria criteria = libUsersExample.createCriteria();
		criteria.andUSexEqualTo("男");
		int manCount = libUsersMapper.countByExample(libUsersExample);
		
		LibUsersExample libUsersExample2 = new LibUsersExample(); 
		LibUsersExample.Criteria criteria2 = libUsersExample2.createCriteria();
		criteria2.andUSexEqualTo("女");
		int womanCount = libUsersMapper.countByExample(libUsersExample2);
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("manCount", manCount);
		map.put("womanCount", womanCount);
		return ReturnResult.success(map);
	}

	@Override
	public List<LibUsers> findLibUserByuName(String uName) throws Exception {
		LibUsersExample libUsersExample = new LibUsersExample(); 
		LibUsersExample.Criteria criteria = libUsersExample.createCriteria();
		criteria.andUNameLike('%'+uName+'%');
		List<LibUsers> libUsersList = libUsersMapper.selectByExample(libUsersExample);
		return libUsersList;
	}

	@Override
	public List<LibUsers> findLibUserByNameanduId(Integer uId, String uName) throws Exception {
		LibUsersExample libUsersExample = new LibUsersExample(); 
		LibUsersExample.Criteria criteria = libUsersExample.createCriteria();
		criteria.andUNameLike('%'+uName+'%');
		criteria.andUIdEqualTo(uId);
		List<LibUsers> libUsersList = libUsersMapper.selectByExample(libUsersExample);
		return libUsersList;
	}
	
}
