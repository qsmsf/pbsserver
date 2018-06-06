package com.easyfly.main.util;

public class ReturnJSON {
	private Integer code = 0;// 是否成功 0：成功 
	private String cmd = "";
	private Object data = null;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
