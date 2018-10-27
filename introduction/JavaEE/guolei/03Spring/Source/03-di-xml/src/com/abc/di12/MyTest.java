package com.abc.di12;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test01() {
		String config = "com/abc/di12/applicationContext.xml";
		// 创建Spring容器对象，加载Spring配置文件（在类路径下）
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		Student student = (Student) ac.getBean("student");
		System.out.println(student);
		
		Teacher teacher = (Teacher) ac.getBean("teacher");
		System.out.println(teacher);
		
	}
	
	
}















