package com.abc.test;

import com.abc.entrusts.ServiceProxyEntrust;
import com.abc.service.SomeServiceImpl;
import com.abc.utils.CglibProxy;

public class Client {
	public static void main(String[] args) {
		// 创建目标对象
		// ISomeService target = new SomeServiceImpl();
		SomeServiceImpl target = new SomeServiceImpl();
		
		// 创建委托对象
		ServiceProxyEntrust mi = new ServiceProxyEntrust(target);
		
		// 创建代理对象
		// ISomeService service = (ISomeService) CglibProxy.newProxyInstance(target.getClass(), mi);   
		SomeServiceImpl service = (SomeServiceImpl) CglibProxy.newProxyInstance(target.getClass(), mi);   
		
		// 调用代理对象的代理方法
		String someResult = service.doSome(5, "月份");
		System.out.println("someResult = " + someResult);
		
		System.out.println("=========================");
		
		// 调用代理对象的代理方法
		service.doOther(2);
	}
}




