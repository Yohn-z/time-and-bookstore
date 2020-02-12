package com.bookshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshop.mapper.AdminMapper;
import com.bookshop.pojo.po.Admin;
import com.bookshop.pojo.po.AdminExample;
import com.bookshop.result.ReturnResult;
import com.bookshop.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private AdminMapper adminMapper;
	
	//查询管理员用户
	@Override
	public List<Admin> getAdminList() throws Exception {
		
		/*AdminExample adminExample = new AdminExample();
		AdminExample.Criteria criteria = adminExample.createCriteria();*/
		//设置查询条件，根据账号查询
		List<Admin> list = adminMapper.selectByExample(null);
		
			return list;
		
	}
	//根据用户名查询账户
	public Admin findAdminByAdminname(String user) throws Exception{
		AdminExample adminExample = new AdminExample();
		AdminExample.Criteria criteria = adminExample.createCriteria();
		criteria.andUserEqualTo(user);
		List<Admin> list = adminMapper.selectByExample(adminExample);
		if(list!=null && list.size()==1) {
			return list.get(0);
		}
		return null;
	}
	//校验管理员登陆合法性
/*	public ReturnResult checkAdmin(String user,String pass) throws Exception{
		//List<Admin> Adminlist = this.getAdminList();
		Admin adminuser = this.findAdminByAdminname(user);
		if(adminuser == null) {
			return ReturnResult.error("0", "用户不存在");
		}
		if(!adminuser.getPass().equals(pass)) {
			return ReturnResult.error("0", "密码错误");
		}
		
		
		
		return null;
		
	}*/

}
