package com.abc.beans;

import java.util.Set;

public class Country {
	private Integer cid;
	private String cname;
	
	// 关联属性
	private Set<Minister> ministers;

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(String cname) {
		super();
		this.cname = cname;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set<Minister> getMinisters() {
		return ministers;
	}

	public void setMinisters(Set<Minister> ministers) {
		this.ministers = ministers;
	}

	@Override
	public String toString() {
		return "Country [cid=" + cid + ", cname=" + cname + ", ministers=" + ministers + "]";
	}

}
