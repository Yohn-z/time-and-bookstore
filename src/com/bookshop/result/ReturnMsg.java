package com.bookshop.result;

public enum ReturnMsg {
	SUCCESS("1", "成功"),
	EXCEPTION1("10001", "1*******异常"),
	EXCEPTION2("10002", "2*******异常"),
	EXCEPTION3("10003", "3*******异常"),
	EXCEPTION4("10004", "4*******异常"),
	EXCEPTION5("10005", "5*******异常"),
	ERROR("0", "失败");
	
	private String code;
	private String msg;
	
	private ReturnMsg (String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
