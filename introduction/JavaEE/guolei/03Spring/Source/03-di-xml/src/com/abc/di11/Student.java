package com.abc.di11;

public class Student {
	
	public Student() {
		System.out.println("-------------");
	}

	private String name;
	private int age;
	private String school; // 学校
	private String department; // 学院

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school + ", department=" + department + "]";
	}

}
