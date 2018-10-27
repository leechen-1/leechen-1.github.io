package com.abc.di08;

public class Student {
	private String name; // 成员变量
	private int age;
	private School school;   // 对象属性，域属性

	public void setName(String name) { 
		this.name = name;
	}

	public void setAge(int age) { 
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
