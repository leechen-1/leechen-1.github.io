package com.abc.di03;

public class Student {
	private String name; // 成员变量
	private int age;
	private School school;   // 对象属性，域属性

	public void setXxx(String name) { // xxx
		this.name = name;
	}

	public void setJjj(int age) { // jjj
		this.age = age;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
	}

}
