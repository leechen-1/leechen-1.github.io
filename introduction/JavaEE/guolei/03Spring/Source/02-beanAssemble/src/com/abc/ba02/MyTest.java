package com.abc.ba02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	@Test
	public void test01() {
		ISomeService service = new SomeServiceImpl();
		service.doSome();
	}
	
	// 使用工厂模式实现了当前测试类与SomeServiceImpl类的解耦合
	// 但该方式增加了两对耦合：
	// 当前测试类与工厂类
	// 工厂类与SomeServiceImpl
	@Test
	public void test02() {
		ServiceFactory factory = new ServiceFactory();
		ISomeService service = factory.getSomeService();
		service.doSome();
	}
	
	// 不仅没有降低测试类与工厂类的耦合度，还降低了执行效率
	@Test
	public void test03() {
		String config = "com/abc/ba02/applicationContext.xml";
		// 创建Spring容器对象，加载Spring配置文件（在类路径下）
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		ServiceFactory factory = (ServiceFactory) ac.getBean("factory");
		ISomeService service = factory.getSomeService();
		service.doSome();
	}
	
	@Test
	public void test04() {
		String config = "com/abc/ba02/applicationContext.xml";
		// 创建Spring容器对象，加载Spring配置文件（在类路径下）
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		ISomeService service = (ISomeService) ac.getBean("someService");
		service.doSome();
	}
}















