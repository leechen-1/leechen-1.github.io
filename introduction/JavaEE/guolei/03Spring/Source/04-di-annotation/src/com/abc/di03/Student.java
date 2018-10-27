package com.abc.di03;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("student")     // 表示当前类的对象将由Spring容器来管理
public class Student {
	@Value("张三")
	private String name; // 成员变量
	@Value("23")
	private int age;
	
	// @Resource                  // byType域属性自动注入，JSR250
	@Resource(name="mySchool")    // byName域属性自动注入，JSR250
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
