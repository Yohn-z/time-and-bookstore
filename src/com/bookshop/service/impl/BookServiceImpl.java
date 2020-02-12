package com.bookshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshop.mapper.AdminMapper;
import com.bookshop.mapper.LibSkztMapper;
import com.bookshop.mapper.LibTsMapper;
import com.bookshop.mapper.LibTsMapperCustom;
import com.bookshop.mapper.LibTslbMapper;
import com.bookshop.pojo.po.Admin;
import com.bookshop.pojo.po.LibSkzt;
import com.bookshop.pojo.po.LibTs;
import com.bookshop.pojo.po.LibTsExample;
import com.bookshop.pojo.po.LibTsjy;
import com.bookshop.pojo.po.LibTsjyExample;
import com.bookshop.pojo.po.LibTslb;
import com.bookshop.pojo.vo.LibTsCustom;
import com.bookshop.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private LibTsMapper libTsMapper;
	@Autowired
	private LibSkztMapper libSkztMapper;
	@Autowired
	private LibTslbMapper libTslbMapper;
	@Autowired
	private AdminMapper adminMapper;
	
	@Autowired
	private LibTsMapperCustom libTsMapperCustom;
	
	//查询数据库中的所有书刊
	@Override
	public List<LibTsCustom> getLibTsCustomList() {
		return libTsMapperCustom.getLibTsCustomList();
	}

	//根据主键查询数据库书刊
	@Override
	public LibTs findLibTsBytsid(Integer tsId) throws Exception {
		
		return libTsMapper.selectByPrimaryKey(tsId);
	}

	//插入图书
	@Override
	public void insertLibTs(LibTs libTs) throws Exception {
		libTsMapper.insert(libTs);
	
	}
    //所有状态列表
	@Override
	public List<LibSkzt> getLibSkztList() throws Exception {
		List<LibSkzt> list = libSkztMapper.selectByExample(null);
		return list;
	}
	//所有图书类别
	@Override
	public List<LibTslb> getLibTslbList() throws Exception {
		List<LibTslb> list = libTslbMapper.selectByExample(null);
		return list;
	}

	//删除图书
	@Override
	public Boolean deleteLibTs(Integer tsId) throws Exception {

		//验证id是否存在
		if(this.findLibTsBytsid(tsId)==null) {
			return false;
		}
		
		libTsMapper.deleteByPrimaryKey(tsId);
		return true;
	}

	//查询用户权限
	@Override
	public int findAdminclass(Integer adminId) throws Exception {
		Admin admin = adminMapper.selectByPrimaryKey(adminId);
		return admin.getUserclass();
	}

	//根据主键修改用户信息
	@Override
	public String updateLibTs(LibTs libTs) throws Exception {
		if(libTs.getTsOnnum()>libTs.getTsSum()) {
			return "在册数量不能大于总数量";
		}
		
		libTsMapper.updateByPrimaryKey(libTs);
		
		return "修改成功";
	}

	@Override
	public List<LibTs> getLibTsByTsName(String name) throws Exception {
		LibTsExample libTs = new LibTsExample();
		LibTsExample.Criteria criteria = libTs.createCriteria();
		criteria.andTsNameLike('%'+name+'%');
		
		List<LibTs> libtslist = libTsMapper.selectByExample(libTs);
		return libtslist;
	}
	
	
}
