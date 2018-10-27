package com.abc.di06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * 与@Component功能相同，意义不同的注解，还有三个：
 * @Service：注解在Service类上
 * @Repository：注解在Dao类上
 * @Controller：注解在SpringMVC的处理器上
 * 
 */

@Component("student")     // 表示当前类的对象将由Spring容器来管理
public class Student {
	@Value("王五")
	private String name; // 成员变量
	@Value("23")
	private int age;
	
	@Autowired     // byType域属性自动注入
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
