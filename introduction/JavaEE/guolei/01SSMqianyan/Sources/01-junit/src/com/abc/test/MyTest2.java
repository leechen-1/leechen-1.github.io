package com.abc.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.abc.service.ISomeService;
import com.abc.service.SomeServiceImpl;

public class MyTest2 {

	private ISomeService service;

	// 该方法会在每一个测试方法执行之前先执行。
	// 该方法中一般编写初始化代码
	@Before
	public void setUp() throws Exception {
		service = new SomeServiceImpl();
	}

	// 该方法会在每一个测试方法执行之后再执行
	// 该方法中一般编写资源释放代码
	@After
	public void tearDown() throws Exception {
		System.out.println("=============");
	}

	@Test
	public void testDoSome() {
		service.doSome();
	}

	@Test
	public void testDoOther() {
		service.doOther();
	}
	
	@Test
	public void test01() {
		System.out.println(3 / 0);
	}
}





















