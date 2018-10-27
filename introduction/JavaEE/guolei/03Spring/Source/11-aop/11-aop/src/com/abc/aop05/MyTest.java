package com.abc.aop05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test01() throws UserException {
		String config = "com/abc/aop05/applicationContext.xml";
		// 创建Spring容器对象，加载Spring配置文件（在类路径下）
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		ISomeService service = (ISomeService) ac.getBean("someServiceProxy");
		service.checkUser("rjxy", "111222");
	}
	
	@Test
	public void test02() {
		String config = "com/abc/aop05/applicationContext.xml";
		// 创建Spring容器对象，加载Spring配置文件（在类路径下）
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		ISomeService service = (ISomeService) ac.getBean("someServiceProxy");
		try {
			service.checkUser("rjxyxxxx", "111");
		} catch (UserException e) {
			e.printStackTrace();
		}
	}
	
	
}















