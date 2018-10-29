package com.abc.aop07;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test01() {
		String config = "com/abc/aop07/applicationContext.xml";
		// 创建Spring容器对象，加载Spring配置文件（在类路径下）
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		SomeService service = (SomeService) ac.getBean("someServiceProxy");
		service.doFirst();
		System.out.println("---------------");
		service.doSecond();
	}
	
	
}














