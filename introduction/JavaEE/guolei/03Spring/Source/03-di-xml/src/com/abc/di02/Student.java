package com.abc.di02;

public class Student {
	private String name; // 成员变量
	private int age;
	private School school; // 对象属性，域属性

	public Student(String name, int age, School school) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
	}

}
