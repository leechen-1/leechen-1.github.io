package com.abc.beans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Student {
	@NotEmpty(message="用户名不能为空")
	@Size(min=6, max=12, message="用户名长度应为{min}-{max}个字符")
	private String name;
	
	@Min(value=0, message="成绩最小值为{value}")
	@Max(value=100, message="成绩最大值为{value}")
	private double score;
	
	@NotEmpty(message="手机号不能为空")
	@Pattern(regexp="^1[34578]\\d{9}$", message="手机号格式不正确")
	private String mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", mobile=" + mobile + "]";
	}
	
}
