package com.bookshop.usercontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookshop.pojo.po.Admin;
import com.bookshop.pojo.po.LibUsers;
import com.bookshop.result.ReturnResult;
import com.bookshop.service.LoginService;
import com.bookshop.service.UserService;


/**

* <p>Title: LoginControll.java<／p>
* <p>Description: <／p>
* @author 张禹鸿
* @date 2018年10月28日 上午11:38:03
* @version 1.0
*/
@RestController
@RequestMapping("/user/userlogin")
public class ULoginControll {
	@Autowired
	LoginService loginService;
	@Autowired 
	UserService userService;
	

	
	
	/**

	* <p>Title: 读者用户的登陆<／p>
	* <p>Description: <／p>
	* @author 张禹鸿
	* @date 2018年10月28日 上午11:38:03
	* @version 1.0
	*/
	@RequestMapping("/checkuserlogin")
	public ReturnResult checkUser(HttpSession session,@RequestBody LibUsers libUser) throws Exception{
		//List<Admin> Adminlist = this.getAdminList();
		
		LibUsers activelibUsers = userService.findLibUserByuId(libUser.getuId());
		if(activelibUsers == null) {
			return ReturnResult.error("0", "用户不存在");
		}
		if(!activelibUsers.getuPass().equals(libUser.getuPass())) {
			return ReturnResult.error("0", "密码错误");
		}
		activelibUsers.setuPass(null);
		session.setAttribute("activelibUsers", activelibUsers);
		
		
		
		return ReturnResult.success();
		
	}
	@RequestMapping("/check")
	public ReturnResult check(HttpSession session)throws Exception{
		LibUsers libUsers = (LibUsers)session.getAttribute("activelibUsers");
		if(libUsers==null) {
			return ReturnResult.error();
		}
		
		return ReturnResult.success(libUsers);
	      
	}
	
	@RequestMapping("/logout")
	public ReturnResult logout(HttpSession session)throws Exception{
		session.removeAttribute("activelibUsers");
		return ReturnResult.success();
	}
	
	

}
