package com.abc.di13;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test01() {
		/*
		String config1 = "com/abc/di13/spring-base.xml";
		String config2 = "com/abc/di13/spring-beans.xml";
		// 创建Spring容器对象，加载Spring配置文件（在类路径下）
		ApplicationContext ac = new ClassPathXmlApplicationContext(config1, config2);
		*/
		/*
		String config1 = "com/abc/di13/spring-base.xml";
		String config2 = "com/abc/di13/spring-beans.xml";
		String[] configs = {config1, config2};
		// 创建Spring容器对象，加载Spring配置文件（在类路径下）
		ApplicationContext ac = new ClassPathXmlApplicationContext(configs);
		 */
		
		String config = "com/abc/di13/spring-*.xml";
		// 创建Spring容器对象，加载Spring配置文件（在类路径下）
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		
		Student student = (Student) ac.getBean("student");
		System.out.println(student);
		
		Teacher teacher = (Teacher) ac.getBean("teacher");
		System.out.println(teacher);
		
	}
	
	
}















