package com.abc.di11;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test01() {
		String config = "com/abc/di11/applicationContext.xml";
		// 创建Spring容器对象，加载Spring配置文件（在类路径下）
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		Student student = (Student) ac.getBean("student");
		System.out.println(student);
		Student student2 = (Student) ac.getBean("student2");
		System.out.println(student2);
		Student student3 = (Student) ac.getBean("student3");
		System.out.println(student3);
		/*
		Student base = (Student) ac.getBean("base");
		System.out.println(base);
		*/
		
	}
	
	
}















