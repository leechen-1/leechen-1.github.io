package com.abc.aop10;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test01() {
		String config = "com/abc/aop10/applicationContext.xml";
		// 创建Spring容器对象，加载Spring配置文件（在类路径下）
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		ISomeService someService = (ISomeService) ac.getBean("someServiceProxy");
		someService.doFirst();
		System.out.println("---------------");
		someService.doSecond();
		System.out.println("---------------");
		someService.doThird();
	}
	
}















