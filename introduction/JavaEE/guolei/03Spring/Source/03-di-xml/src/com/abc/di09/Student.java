package com.abc.di09;

public class Student {
	private String name; // 成员变量
	private int age;

	public void setName(String name) { 
		this.name = name;
	}

	public void setAge(int age) { 
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
