package com.bookshop.usercontroller;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookshop.pojo.po.LibUsers;
import com.bookshop.result.ReturnResult;
import com.bookshop.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/user/useruser")
public class UUserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/userlist")
	public ReturnResult pageList(
			@RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo,//当前页码
			@RequestParam(required = true, defaultValue = "5",value="pageSize") Integer pageSize//每页显示记录数
			)throws Exception{
	   
	    //分页查询
	    PageHelper.startPage(pageNo, pageSize);
	    List<LibUsers> allLibUsersList = userService.getAllLibUsersList();
	    PageInfo<LibUsers> pageInfo=new PageInfo<LibUsers>(allLibUsersList);
	    
	    return ReturnResult.success(pageInfo.getTotal(), pageInfo);
	}
	
	@RequestMapping("/insertuser")
	public ReturnResult insertUser(@RequestBody LibUsers libUsers) throws Exception{
		Date date = new Date(0);
		DateFormat df = DateFormat.getDateInstance(); 
	    SimpleDateFormat sdf = (SimpleDateFormat)DateFormat.getDateTimeInstance(); 
	    System.out.println("当前日期时间：" + df.format(date)); System.out.println("当前日期时间：" + sdf.format(date));

	    libUsers.setuTime( df.format(date));
		String msg = userService.insertLibUsers(libUsers);
		if(msg.equals("已经存在该用户"))
		{
			return ReturnResult.error("0", msg);
		}
		return ReturnResult.error("1", msg);
		
	}
	
	@RequestMapping("/deleteuser")
	public ReturnResult deleteUser(@RequestBody LibUsers libUsers)throws Exception{
		String msg = userService.deleteLibUser(libUsers);
		return ReturnResult.error("1", msg);
		
	}
	@RequestMapping("/updateinfo")
	public ReturnResult updateUserinfo(@RequestBody LibUsers libUsers) throws Exception{
		LibUsers libu = userService.findLibUserByuId(libUsers.getuId());
		if(libu == null) {
			return ReturnResult.error("0", "该用户不存在");
		}
		
		return ReturnResult.success(libu);
		
	}
	@RequestMapping("/updateuser")
	public ReturnResult updateUser(@RequestBody LibUsers libUsers) throws Exception{
		LibUsers libu = userService.findLibUserByuId(libUsers.getuId());
		libUsers.setuDebt(libu.getuDebt());
		libUsers.setuTime(libu.getuTime());
		libUsers.setuPicurl(libu.getuPicurl());
		String msg = userService.updateLibUser(libUsers);
		
		return ReturnResult.error("1", msg);
		
	}
	@RequestMapping("/finduser")
	public ReturnResult findUserById(HttpSession session) throws Exception{
		LibUsers activelibUsers = (LibUsers) session.getAttribute("activelibUsers");
		if(activelibUsers!=null) {
		LibUsers libUser = userService.findLibUserByuId(activelibUsers.getuId());
		return ReturnResult.success(libUser);
		}
		return ReturnResult.error();
		
		
	}
	

}
