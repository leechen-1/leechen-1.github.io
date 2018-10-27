package com.abc.aop06;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

// 后置通知
public class MyAfterReturningAdvice implements AfterReturningAdvice {

	// returnValue：目标方法的返回值
	// 该方法虽然可以获取到目标方法的执行结果，但不能改变目标方法的值
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("执行后置通知方法");
		if(returnValue != null) {
			returnValue = ((String)returnValue).toUpperCase();
		}
		System.out.println("returnValue = " + returnValue);
	}

}
