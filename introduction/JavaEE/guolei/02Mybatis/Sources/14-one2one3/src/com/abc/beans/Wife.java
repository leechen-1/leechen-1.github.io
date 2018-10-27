package com.abc.beans;

public class Wife {
	private Integer wid;
	private String wname;

	public Wife() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wife(String wname) {
		super();
		this.wname = wname;
	}

	public Integer getWid() {
		return wid;
	}

	public void setWid(Integer wid) {
		this.wid = wid;
	}

	public String getWname() {
		return wname;
	}

	public void setWname(String wname) {
		this.wname = wname;
	}

	@Override
	public String toString() {
		return "Wife [wid=" + wid + ", wname=" + wname + "]";
	}

}
