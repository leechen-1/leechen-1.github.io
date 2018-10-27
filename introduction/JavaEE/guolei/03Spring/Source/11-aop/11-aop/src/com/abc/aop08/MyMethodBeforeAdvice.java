package com.abc.aop08;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

// 前置通知
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

	// method：目标方法
	// args：目标方法的参数列表
	// target：目标对象
	// 该before()方法会在目标方法执行之前先执行
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("执行前置通知方法");
	}

}
