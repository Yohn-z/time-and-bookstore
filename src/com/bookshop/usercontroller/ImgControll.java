package com.bookshop.usercontroller;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bookshop.pojo.po.LibUsers;
import com.bookshop.result.ReturnResult;
import com.bookshop.service.UserService;
import com.bookshop.util.FileUtil;
import com.bookshop.util.IDUtils;

@RestController
@RequestMapping("/user/img")
public class ImgControll {
	
	@Autowired
	UserService userService;
	
	@ResponseBody
    @RequestMapping(value="/upimg",method=RequestMethod.POST)
	public ReturnResult test(@RequestParam("pic") MultipartFile file,HttpServletRequest request) throws Exception{

		System.out.println("comming!");
		/*String path = request.getSession().getServletContext().getRealPath("/");
		System.out.println("path>>"+path);
 
		String fileName = file.getOriginalFilename();
		System.out.println("fileName>>"+fileName);
		
		File dir = new File(path, fileName);
		System.out.println("dir.exists()>>"+dir.exists());
		if(!dir.exists()){
			dir.mkdirs();
		}
		System.out.println("dir.exists()>>"+dir.exists());
//		MultipartFile自带的解析方法
		file.transferTo(dir);*/
		String oldFileName = file.getOriginalFilename();
		//文件后缀
		String suffix = oldFileName.substring(oldFileName.lastIndexOf("."));
		
		
		
		
		//获取文件提交路径(服务器)
		//request.getServletContext() --> application
		String filePath = request.getServletContext().getRealPath("/");
        //获取项目名
        String projectName = request.getContextPath();
        //将项目跟路劲下的项目名称置为空，因为图片需要在项目外的webapp下面存放,sub截取下标为1的字符
        filePath=filePath.replace(projectName.substring(1),"");
        System.out.println(filePath);
        //重新生成文件名字
        String fileName = IDUtils.genImageName()+suffix;
		//上传文件 java.io.File
		//File targetFile = new File(uploadPath,newFileName);
		try {
			file.transferTo(new File(filePath+"staticimage/"+fileName));
		} catch (IllegalStateException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}
		LibUsers libusers=(LibUsers)request.getSession().getAttribute("activelibUsers");
		LibUsers findLibUserByuId = userService.findLibUserByuId(libusers.getuId());
		findLibUserByuId.setuPicurl("/staticimage/"+fileName);
		userService.updateLibUser(findLibUserByuId);
		
		return ReturnResult.success();

	}

}
