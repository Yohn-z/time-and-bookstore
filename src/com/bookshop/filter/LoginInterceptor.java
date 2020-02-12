package com.bookshop.filter;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.bookshop.pojo.po.Admin;
import com.bookshop.pojo.po.LibUsers;


/**

* <p>Title: LoginInterceptor.java<／p>
* <p>Description:用户拦截器 ，身份校验<／p>
* @author 张禹鸿
* @date 2018年9月8日 下午7:31:05
* @version 1.0
*/
public class LoginInterceptor implements HandlerInterceptor{
    //进入action之前
	//用于用户认证，用户授权
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
	//校验用户身份是否合法
		HttpSession session = request.getSession();
		Admin activeadmin = (Admin) session.getAttribute("activeadmin");
		//LibUsers activelibUsers = (LibUsers) session.getAttribute("activelibUser");
		if(activeadmin != null) {
			//用户已登录
			return true;
		}
		/*if(activelibUsers != null && activeadmin==null) {
			//用户已登录
			return true;
		}*/
	//校验用户访问是否公开资源地址
		List<String> open_urls = new ArrayList<String>();
		open_urls.add("/admin/login/checklogin");
		open_urls.add("/admin/login/logout");
		//open_urls.add("/user/userlogin/checkuserlogin");
		String url =request.getRequestURI();
		for(String open_url:open_urls) {
			if(url.indexOf(open_url)>=0) {
				//如果访问的是公开地址就放行
				return true;
			}
		}
	//拦截用户操作，跳转登录页面
		//request.getRequestDispatcher("afterhtml/index.html").forward(request, response);
		//抛出异常，需要登录
		System.out.println("5555");
		//response.sendRedirect("bookshophhit/index.html");
		System.out.println("222");
		return false;
	}
	//进入action方法，返回modelandView之前
	//在这里同一对返回的数据进行数据处理，比如同一添加菜单，导航
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	
		
	}
	//已经返回值
	//同一处理系统异常，记录系统日志，监控action方法的执行时间
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		
	}

}
