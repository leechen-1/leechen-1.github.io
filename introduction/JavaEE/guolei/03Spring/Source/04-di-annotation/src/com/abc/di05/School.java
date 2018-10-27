package com.abc.di05;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mySchool")
public class School {
	@Value("安阳师范学院")
	private String sname;

	@Override
	public String toString() {
		return "School [sname=" + sname + "]";
	}

}
