package com.abc.aop16;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

	// 前置通知
	public void myBefore() {
		System.out.println("执行前置通知方法");
	}

	// 前置通知
	public void myBefore(JoinPoint jp) {
		System.out.println("执行前置通知方法 jp = " + jp);
	}

	// 后置通知
	public void myAfterReturning() {
		System.out.println("执行后置通知方法");
	}

	// 后置通知
	public void myAfterReturning(Object result) {
		System.out.println("执行后置通知方法 result = " + result);
	}

	// 环绕通知
	public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("执行环绕通知 -- 目标方法执行之前");
		// 执行目标方法
		Object proceed = pjp.proceed();
		System.out.println("执行环绕通知 -- 目标方法执行之后");
		if (proceed != null) {
			proceed = ((String) proceed).toUpperCase();
		}
		return proceed;
	}

	// 异常通知
	public void myAfterThrowing() {
		System.out.println("执行异常通知方法");
	}
	
	// 异常通知
	public void myAfterThrowing(Exception ex) {
		System.out.println("执行异常通知方法 ex = " + ex.getMessage());
	}
	
	// 最终通知
	public void myAfter() {
		System.out.println("执行最终通知方法");
	}
}





























