package com.abc.ba06;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

	@Test
	public void test01() {
		String config = "com/abc/ba06/applicationContext.xml";
		// 创建Spring容器对象，加载Spring配置文件（在类路径下）
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		ISomeService service = (ISomeService) ac.getBean("someService");
		String result11 = service.doSome();
		String result12 = service.doOther();
		System.out.println(result11);
		System.out.println(result12);
		
		System.out.println("====================");
		
		ISomeService service2 = (ISomeService) ac.getBean("someService2");
		String result21 = service2.doSome();
		String result22 = service2.doOther();
		System.out.println(result21);
		System.out.println(result22);
	}

}
