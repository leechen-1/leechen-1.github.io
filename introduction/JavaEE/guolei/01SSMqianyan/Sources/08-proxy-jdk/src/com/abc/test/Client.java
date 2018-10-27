package com.abc.test;

import java.lang.reflect.Proxy;

import com.abc.entrusts.ServiceProxyEntrust;
import com.abc.service.ISomeService;
import com.abc.service.SomeServiceImpl;

public class Client {
	public static void main(String[] args) {
		// 创建目标对象
		ISomeService target = new SomeServiceImpl();
		// 创建委托对象
		ServiceProxyEntrust ih = new ServiceProxyEntrust(target);
		// 创建代理对象
		ISomeService service = (ISomeService) Proxy.newProxyInstance(
							target.getClass().getClassLoader(),  // 目标类的类加载器 
							target.getClass().getInterfaces(),   // 目标类所实现的所有接口
							ih);                                 // 委托对象                     
		// 调用代理对象的代理方法
		String someResult = service.doSome(5, "月份");
		System.out.println("someResult = " + someResult);
		
		System.out.println("=========================");
		
		// 调用代理对象的代理方法
		service.doOther();
	}
}




