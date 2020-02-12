package com.bookshop.result;

public class ReturnResult {
	private long total;
	private Object data;
	private String code;
	private String msg;
 
	private ReturnResult(long total, Object data, String code, String msg) {
		this.total = total;
		this.data = data;
		this.code = code;
		this.msg = msg;
	}
 
	private ReturnResult(Object data) {
		this.data = data;
		this.code = ReturnMsg.SUCCESS.getCode();
		this.msg = ReturnMsg.SUCCESS.getMsg();
	}
 
	private ReturnResult(long total, Object data) {
		this.total = total;
		this.data = data;
		this.code = ReturnMsg.SUCCESS.getCode();
		this.msg = ReturnMsg.SUCCESS.getMsg();
	}
 
	private ReturnResult(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	private ReturnResult(String code,String msg,Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
 
	private ReturnResult() {
		this.code = ReturnMsg.ERROR.getCode();
		this.msg = ReturnMsg.ERROR.getMsg();
	}
 
	/***
	 * 输入参数:
	 * 
	 * @param total
	 * @param data
	 * @param code
	 * @param msg
	 * @return 返回成功，包含total、code、msg、data
	 */
	public static ReturnResult success(long total, Object data, String code, String msg) {
		return new ReturnResult(total, data, code, msg);
	}
 
	/***
	 * 输入参数
	 * 
	 * @param total
	 * @param data
	 * @return 返回成功，包含total、code、msg、data
	 */
	public static ReturnResult success(long total, Object data) {
		return new ReturnResult(total, data);
	}
 
	/***
	 * 输入参数：
	 * 
	 * @param data
	 * @return 返回成功，包含code、msg、data
	 */
	public static ReturnResult success(Object data) {
		return new ReturnResult(data);
	}

//自定义
	public static ReturnResult success(String code,String msg,Object data) {
		return new ReturnResult(code,msg,data);
	}
 
	/***
	 * 无输入参数 返回成功，包含code、msg
	 * 
	 * @return
	 */
	public static ReturnResult success() {
		return new ReturnResult("");
	}
 
	/***
	 * 无输入参数 返回失败，包含code、msg
	 * 
	 * @return
	 */
	public static ReturnResult error() {
		return new ReturnResult();
	}
 
	public static ReturnResult error(String code, String msg) {
		return new ReturnResult(code, msg);
	}
 
	public long getTotal() {
		return total;
	}
 
	public void setTotal(long total) {
		this.total = total;
	}
 
	public Object getData() {
		return data;
	}
 
	public void setData(Object data) {
		this.data = data;
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


