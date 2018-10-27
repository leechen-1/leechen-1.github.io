package com.abc.aop14;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test01() {
		String config = "com/abc/aop14/applicationContext.xml";
		// 创建Spring容器对象，加载Spring配置文件（在类路径下）
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		ISomeService someService = (ISomeService) ac.getBean("someService");
		someService.doFirst();
		System.out.println("---------------");
		someService.doSecond();
		System.out.println("---------------");
		someService.doThird();
		
		System.out.println("========================");
		
		ISomeService someService2 = (ISomeService) ac.getBean("someService2");
		someService2.doFirst();
		System.out.println("---------------");
		someService2.doSecond();
		System.out.println("---------------");
		someService2.doThird();
	}
	
}















