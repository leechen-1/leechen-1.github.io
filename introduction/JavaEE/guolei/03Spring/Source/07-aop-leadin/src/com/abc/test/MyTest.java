package com.abc.test;

import com.abc.service.ISomeService;
import com.abc.service.SomeServiceImpl;

public class MyTest {

	public static void main(String[] args) {
		ISomeService service = new SomeServiceImpl();
		service.doFirst();
		System.out.println("--------------");
		service.doSecond();
	}

}
