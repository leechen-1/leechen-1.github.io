package com.abc.utils;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

public class CglibProxy {

	// 用于创建代理对象
	// targetClass：目标类
	// mi：委托类对象
	public static Object newProxyInstance(Class targetClass, 
			MethodInterceptor mi) {
		// 增强器
		Enhancer enhancer = new Enhancer();
		// 指定父类，即指定目标类
		enhancer.setSuperclass(targetClass);
		// 指定回调对象，即指定委托类对象
		enhancer.setCallback(mi);
		// 创建并返回代理对象
		return enhancer.create();
	}

}




