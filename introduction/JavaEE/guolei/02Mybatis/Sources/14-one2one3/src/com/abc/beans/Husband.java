package com.abc.beans;

public class Husband {
	private Integer hid;
	private String hname;
	// 关联属性
	private Wife wife;

	public Husband() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Husband(String hname) {
		super();
		this.hname = hname;
	}

	public Integer getHid() {
		return hid;
	}

	public void setHid(Integer hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public Wife getWife() {
		return wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

	@Override
	public String toString() {
		return "Husband [hid=" + hid + ", hname=" + hname + ", wife=" + wife + "]";
	}

}
