package com.abc.di09;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test01() {
		String config = "com/abc/di09/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		
		Person person = (Person) ac.getBean("person");
		System.out.println("person = " + person);
		
		Student student = (Student) ac.getBean("student");
		System.out.println("student = " + student);
	}
	
	
}















