package com.abc.ba05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

	@Test
	public void test01() {
		String config = "com/abc/ba05/applicationContext.xml";
		// 创建Spring容器对象，加载Spring配置文件（在类路径下）
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		ISomeService service = (ISomeService) ac.getBean("someService");
		System.out.println(service);
		System.out.println("====================");
		ISomeService service2 = (ISomeService) ac.getBean("someService2");
		System.out.println(service2);
	}

}
