package com.abc.test;

import com.abc.proxy.ServiceProxy;
import com.abc.service.ISomeService;

public class Client {
	public static void main(String[] args) {
		// 创建代理对象
		ISomeService service = new ServiceProxy();
		// 调用代理对象的代理方法
		String someResult = service.doSome(5, "月份");
		System.out.println("someResult = " + someResult);
		
		System.out.println("=========================");
		
		// 调用代理对象的代理方法
		service.doOther();
	}
}



