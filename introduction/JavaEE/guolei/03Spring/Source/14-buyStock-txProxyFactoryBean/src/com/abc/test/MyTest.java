package com.abc.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.exceptions.BuyStockException;
import com.abc.service.IBuyStockService;

public class MyTest {
	
	private IBuyStockService service;

	@Before
	public void before() {
		String config = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		service = (IBuyStockService) ac.getBean("serviceProxy");
	}
	
	@Test
	public void test01() {
		service.openAccount("张三", 10000);
		service.openStock("安彩高科", 0);
	}
	
	@Test
	public void test02() {
		try {
			service.buyStock("张三", 2000, "安彩高科", 500);
		} catch (BuyStockException e) {
			e.printStackTrace();
		}
	}
	
	
	
}















