package com.abc.test;

import com.abc.service.XCService;
import com.abc.service.ZCService;

public class MyTest {

	public static void main(String[] args) {
		ZCService zc = new ZCService();
		XCService xc = new XCService();
		
		zc.havingDinner();
		
		System.out.println("---------------------");
		
		xc.havingDinner();
	}

}
