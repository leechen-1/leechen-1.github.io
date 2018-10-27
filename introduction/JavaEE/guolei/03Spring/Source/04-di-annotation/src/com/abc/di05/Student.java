package com.abc.di05;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("student")     // 表示当前类的对象将由Spring容器来管理
@Scope("singleton")       // 单例模式，默认
// @Scope("prototype")    // 原型模式
public class Student {
	@Value("张三")
	private String name; // 成员变量
	@Value("23")
	private int age;
	
	// @Resource                  // byType域属性自动注入，JSR250
	@Resource(name="mySchool")    // byName域属性自动注入，JSR250
	private School school;   // 对象属性，域属性

	@PostConstruct
	public void initAfter() {
		System.out.println("对象初始化完毕");
	}
	
	@PreDestroy
	public void destroyBefore() {
		System.out.println("对象销毁之前");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
	}

}
