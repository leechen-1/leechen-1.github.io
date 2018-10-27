package com.abc.ba03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	
	@Test
	public void test01() {
		ISomeService service = ServiceFactory.getSomeService();
		service.doSome();
	}
	
	@Test
	public void test02() {
		String config = "com/abc/ba03/applicationContext.xml";
		// 创建Spring容器对象，加载Spring配置文件（在类路径下）
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		ISomeService service = (ISomeService) ac.getBean("someService");
		service.doSome();
	}
	
	
}















