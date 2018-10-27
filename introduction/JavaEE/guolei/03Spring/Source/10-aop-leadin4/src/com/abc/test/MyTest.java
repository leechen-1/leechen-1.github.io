package com.abc.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.abc.service.ISomeService;
import com.abc.service.ServiceUtils;
import com.abc.service.SomeServiceImpl;

public class MyTest {

	public static void main(String[] args) {
		ISomeService target = new SomeServiceImpl();
		ISomeService service = (ISomeService) Proxy.newProxyInstance(
							target.getClass().getClassLoader(), 
							target.getClass().getInterfaces(), 
							new InvocationHandler() {
								
								@Override
								public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
									ServiceUtils.doTx();
									// 调用目标方法
									Object result = method.invoke(target, args);
									ServiceUtils.doLog();
									return result;
								}
							});
		service.doFirst();
		System.out.println("--------------");
		service.doSecond();
	}

}
