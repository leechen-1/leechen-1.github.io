package com.abc.aop09;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test01() {
		String config = "com/abc/aop09/applicationContext.xml";
		// 创建Spring容器对象，加载Spring配置文件（在类路径下）
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		ISomeService someService = (ISomeService) ac.getBean("someServiceProxy");
		someService.doFirst();
		System.out.println("---------------");
		someService.doSecond();
		System.out.println("---------------");
		someService.doThird();
		
		System.out.println("======================================");
		
		ISomeService otherService = (ISomeService) ac.getBean("otherServiceProxy");
		otherService.doFirst();
		System.out.println("---------------");
		otherService.doSecond();
		System.out.println("---------------");
		otherService.doThird();
	}
	
}















