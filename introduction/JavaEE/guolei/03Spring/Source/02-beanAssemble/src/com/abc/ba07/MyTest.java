package com.abc.ba07;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

	@Test
	public void test01() {
		String config = "com/abc/ba07/applicationContext.xml";
		// 创建Spring容器对象，加载Spring配置文件（在类路径下）
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		ISomeService service = (ISomeService) ac.getBean("someService");
		service.doSome();
		
		// 关闭容器
		((ClassPathXmlApplicationContext)ac).close();
	}

}
