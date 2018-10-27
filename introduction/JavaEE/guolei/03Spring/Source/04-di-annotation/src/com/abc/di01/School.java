package com.abc.di01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class School {
	@Value("安阳师范学院")
	private String sname;

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "School [sname=" + sname + "]";
	}

}
