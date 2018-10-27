package com.abc.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.abc.service.ISomeService;
import com.abc.service.SomeServiceImpl;

public class MyTest {
	
	// 当前代码存在的问题：
	// 当前测试类与SomeServiceImpl类完全耦合在一起
	@Test
	public void test01() {
		ISomeService service = new SomeServiceImpl();
		service.doSome();
	}
	
	@Test
	public void test02() {
		// 创建Spring容器对象，加载Spring配置文件（在类路径下）
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ISomeService service = (ISomeService) ac.getBean("someService");
		service.doSome();
	}
	
	@Test
	public void test03() {
		// 创建Spring容器对象，加载Spring配置文件（在当前项目的根下）
		ApplicationContext ac = new FileSystemXmlApplicationContext("applicationContext.xml");
		ISomeService service = (ISomeService) ac.getBean("someService");
		service.doSome();
	}
	
	@Test
	public void test04() {
		// 创建Spring容器对象，加载Spring配置文件（在e盘根目录下）
		// ApplicationContext ac = new FileSystemXmlApplicationContext("e:\\applicationContext.xml");
		ApplicationContext ac = new FileSystemXmlApplicationContext("e:/applicationContext.xml");
		ISomeService service = (ISomeService) ac.getBean("someService");
		service.doSome();
	}
	
	@Test
	public void test05() {
		// 创建Spring容器对象，加载Spring配置文件
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		ISomeService service = (ISomeService) bf.getBean("someService");
		service.doSome();
	}
	
}















