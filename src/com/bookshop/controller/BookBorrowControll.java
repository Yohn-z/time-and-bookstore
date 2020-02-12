package com.bookshop.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookshop.pojo.po.LibSkzt;
import com.bookshop.pojo.po.LibTs;
import com.bookshop.pojo.po.LibTsjy;
import com.bookshop.pojo.po.LibTslb;
import com.bookshop.pojo.po.LibUsers;
import com.bookshop.pojo.po.TsjyHis;
import com.bookshop.pojo.vo.LibTsCustom;
import com.bookshop.pojo.vo.StringTs;
import com.bookshop.result.ReturnResult;
import com.bookshop.service.BBHistoryService;
import com.bookshop.service.BookBorrowService;
import com.bookshop.service.BookService;
import com.bookshop.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/admin/borrow")
public class BookBorrowControll {

	@Autowired
	private BookService bookService;
	@Autowired
	private UserService userService;
	@Autowired
	private BookBorrowService bookBorrowService;
	@Autowired
	private BBHistoryService bBHistoryService;
	
	@RequestMapping("/bblist")
	public ReturnResult getAll(
			@RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo,//当前页码
			@RequestParam(required = true, defaultValue = "5",value="pageSize") Integer pageSize//每页显示记录数
			
			) throws Exception{
		PageHelper.startPage(pageNo, pageSize);
		List<LibTsjy> list = bookBorrowService.getAllBBList();
		PageInfo<LibTsjy> pageInfo=new PageInfo<LibTsjy>(list);
		return ReturnResult.success(pageInfo);
	}
	
	@RequestMapping("/bbztlist")
	public ReturnResult getBBListbyzt(
			@RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo,//当前页码
			@RequestParam(required = true, defaultValue = "5",value="pageSize") Integer pageSize,//每页显示记录数
			@RequestParam(required = true,value="jyztId") Integer jyztId
			) throws Exception{
		PageHelper.startPage(pageNo, pageSize);
		List<LibTsjy> list = bookBorrowService.getBBListbyJyzt(jyztId);
		PageInfo<LibTsjy> pageInfo=new PageInfo<LibTsjy>(list);
		return ReturnResult.success(pageInfo);
	}
	
	//插入
	@RequestMapping("/insertbb")
	public ReturnResult insertBB(@RequestBody LibTsjy libTsjy) throws Exception{
		
		LibTs libTs = bookService.findLibTsBytsid(libTsjy.getTsId());
		LibUsers user = userService.findLibUserByuId(libTsjy.getuId());
		libTsjy.setJyztId(2);
		if(libTs==null) {
			return ReturnResult.error("0", "不存在该书");
		}
		if(user==null) {
			return ReturnResult.error("0", "不存在该读者");
		}
		
		Integer skztId = libTs.getSkztId();
		if(skztId == 2 || skztId == 3) {
			return ReturnResult.error("0", "该书刊不可以被借阅");
		}
		
		int jynum = libTsjy.getTsjyNum();
		if(jynum>libTs.getTsOnnum()) {
			return ReturnResult.error("0", "借阅数量大于在册数量，无法借阅");
		}
		
		if(skztId!=1) {
		//所需押金
		Double skmoney = libTs.getTsPrice();
		Double summoney = skmoney*jynum;
		//账户剩余
		Double umoney = user.getuDebt();
		user.setuDebt(umoney+summoney);
		//更新
		userService.updateLibUser(user);
		}
		
		if(bBHistoryService.findBBHBytsId(libTsjy.getTsjyId())!=null) {
			return ReturnResult.error("0", "已经存在该单号");
		}
		
		Boolean insertBB = bookBorrowService.insertBB(libTsjy);
		if(!insertBB) {
			return ReturnResult.error("0", "已经存在该单号");
		}
		
		
		return ReturnResult.success();
	}
	@RequestMapping("/updatebb")
	public ReturnResult updateLibTs(@RequestBody LibTsjy libTsjy) throws Exception{
		Boolean updateBB = bookBorrowService.updateBB(libTsjy);
		if(!updateBB) {
			return ReturnResult.error("0", "不存在该借阅单号");
		}
		
		
		return ReturnResult.success();
	}
	@RequestMapping("/deletebb")
	public ReturnResult deleteLibTs(@RequestBody TsjyHis tsjyHis) throws Exception{
		
		
		LibTs ts = bookService.findLibTsBytsid(tsjyHis.getTsId());
		LibUsers libUser = userService.findLibUserByuId(tsjyHis.getuId());
		
		Integer tsjyNum = tsjyHis.getTsjyNum();
		Integer tsOnnum = ts.getTsOnnum();
		Integer tsSum = ts.getTsSum();
		//所需押金
		Double skmoney = ts.getTsPrice();
		Double summoney = skmoney*tsjyNum;
		//账户剩余
		Double umoney = libUser.getuDebt();
		//实际需要赔偿
		Double money = summoney-umoney;
		
		
		if(tsjyHis.getJyztId()==2) {
			return ReturnResult.error("0", "請修改狀態！");
		}
		
		if(tsjyHis.getJyztId()==4) {
			if(money>0) {
				return ReturnResult.error("0", "扣除账户余额后还需支付"+money+"元。");
			}
			libUser.setuDebt(Math.abs(money));
			userService.updateLibUser(libUser);
			
			tsOnnum = tsOnnum-tsjyNum;
			tsSum = tsSum-tsjyNum;
			ts.setTsOnnum(tsOnnum);
			ts.setTsSum(tsSum);
			bookService.updateLibTs(ts);
		}
		
		//执行删除
		Boolean deleteBB = bookBorrowService.deleteBB(tsjyHis.getTsjyId());
		if(!deleteBB) {
			return ReturnResult.error("0", "不存在该借阅单号");
		}
		//成功删除后插入
		
		ReturnResult insertBBH = bBHistoryService.insertBBH(tsjyHis);
		/*Double costmo = tsjyHis.getTsjyCost();
		Double m = costmo - umoney;
		if(costmo - umoney>0) {
			
			return ReturnResult.error("0", "账户余额不足，还需要支付"+m+"元。");
		}
		libUser.setuDebt(Math.abs(costmo - umoney));*/ //这里不对租书花费做扣除，而是减去之前所交押金
		Double y = summoney - umoney;
		if(summoney - umoney>0) {
			
			return ReturnResult.error("0", "账户余额不足，还需要支付"+y+"元。");
		}
		libUser.setuDebt(Math.abs(summoney - umoney));
		userService.updateLibUser(libUser);
		
		return ReturnResult.error("1", "处理成功");
		
		
	}
	@RequestMapping("/updateinfo")
	public ReturnResult updateInfo(@RequestBody LibTsjy libTsjy) throws Exception{
		LibTsjy libTsjyi = bookBorrowService.findBBBytsjyId(libTsjy.getTsjyId());
		if(libTsjyi==null) {
			return ReturnResult.error("0", "不存在该单号");
		}
		
		return ReturnResult.success(libTsjyi);
		
	}
	@RequestMapping("/jytojc")
	public ReturnResult jyTojc(@RequestBody LibTsjy libTsjy) throws Exception{
		LibTsjy libTsjyi = bookBorrowService.findBBBytsjyId(libTsjy.getTsjyId());
		if(libTsjyi==null) {
			return ReturnResult.error("0", "不存在该单号");
		}
		
		LibTs libTs = bookService.findLibTsBytsid(libTsjy.getTsId());
		LibUsers user = userService.findLibUserByuId(libTsjy.getuId());
		libTsjy.setJyztId(2);
		
		
		int jynum = libTsjy.getTsjyNum();
		//所需押金
		Double skmoney = libTs.getTsPrice();
		Double summoney = skmoney*jynum;
		//账户剩余
		Double umoney = user.getuDebt();
		user.setuDebt(umoney+summoney);
		//更新
		userService.updateLibUser(user);
		
		bookBorrowService.updateBB(libTsjy);
		return ReturnResult.success();
		
	}
	@RequestMapping("/refusejy")
	public ReturnResult refuseJy(@RequestBody LibTsjy libTsjy) throws Exception{
		LibTsjy libTsjyi = bookBorrowService.findBBBytsjyId(libTsjy.getTsjyId());
		if(libTsjyi==null) {
			return ReturnResult.error("0", "不存在该单号!");
		}
		else {
			bookBorrowService.deleteBB(libTsjy.getTsjyId());
			return ReturnResult.success();
		}
		
		
	}
	
	//插入
		@RequestMapping("/yyb")
		public ReturnResult yyBB(HttpSession session,@RequestBody LibTsjy libTsjy) throws Exception{
			System.out.println(libTsjy.getTsId());
			if(libTsjy.getTsId() == null) {
				return ReturnResult.error("0", "图书编号错误!");
			}
			LibTs libTs = bookService.findLibTsBytsid(libTsjy.getTsId());
			
			libTsjy.setJyztId(1);
			LibUsers libUsers = (LibUsers) session.getAttribute("activelibUser");
			if(libUsers==null) {
				return ReturnResult.error("0", "请先登陆!");
			}
			if(libTs==null) {
				return ReturnResult.error("0", "不存在该书刊");
			}
			
			Integer skztId = libTs.getSkztId();
			if(skztId == 2 || skztId == 3) {
				return ReturnResult.error("0", "该书刊不可以被预约");
			}
			
			int jynum = libTsjy.getTsjyNum();
			if(jynum>libTs.getTsOnnum()) {
				return ReturnResult.error("0", "借阅数量大于在册数量，无法借阅");
			}
			
			libTsjy.setTsjyNum(1);
			libTsjy.setuId(libUsers.getuId());
			
			/*if(bBHistoryService.findBBHBytsId(libTsjy.getTsjyId())!=null) {
				return ReturnResult.error("0", "已经存在该单号");
			}*/
			
			Boolean insertBB = bookBorrowService.insertBB(libTsjy);
			/*if(!insertBB) {
				return ReturnResult.error("0", "已经存在该单号");
			}*/
			
			
			return ReturnResult.success();
		}
	
}
