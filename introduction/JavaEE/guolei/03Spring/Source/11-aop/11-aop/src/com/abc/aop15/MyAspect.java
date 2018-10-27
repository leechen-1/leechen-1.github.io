package com.abc.aop15;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect // 表示当前类为切面
public class MyAspect {

	// 前置通知
	@Before("execution(* *..aop15.ISomeService.doFirst(..))")
	public void myBefore() {
		System.out.println("执行前置通知方法");
	}

	// 前置通知
	@Before("execution(* *..aop15.ISomeService.doFirst(..))")
	public void myBefore(JoinPoint jp) {
		System.out.println("执行前置通知方法 jp = " + jp);
	}

	// 后置通知
	@AfterReturning("execution(* *..aop15.ISomeService.doSecond(..))")
	public void myAfterReturning() {
		System.out.println("执行后置通知方法");
	}

	// 后置通知
	// 后置通知可以获取到目标方法的执行结果，但不能改变其值
	@AfterReturning(value = "execution(* *..aop15.ISomeService.doSecond(..))", returning = "result")
	public void myAfterReturning(Object result) {
		System.out.println("执行后置通知方法 result = " + result);
	}

	// 环绕通知
	// 环绕通知不仅可以读取到目标方法的执行结果，还可以改变其值
	@Around("execution(* *..aop15.ISomeService.doSecond(..))")
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
	@AfterThrowing("execution(* *..aop15.ISomeService.doThird(..))")
	public void myAfterThrowing() {
		System.out.println("执行异常通知方法");
	}
	
	// 异常通知
	@AfterThrowing(value = "doThirdPointcut()", throwing="ex")
	public void myAfterThrowing(Exception ex) {
		System.out.println("执行异常通知方法 ex = " + ex.getMessage());
	}
	
	// 最终通知
	@After("execution(* *..aop15.ISomeService.doThird(..))")
	public void myAfter() {
		System.out.println("执行最终通知方法");
	}
	// 最终通知
	@After("doThirdPointcut()")
	public void myAfter2() {
		System.out.println("执行最终通知方法2");
	}
	
	// 定义切入点
	@Pointcut("execution(* *..aop15.ISomeService.doFirst(..))")
	private void doFirstPointcut(){}
	@Pointcut("execution(* *..aop15.ISomeService.doSecond(..))")
	private void doSecondPointcut(){}
	@Pointcut("execution(* *..aop15.ISomeService.doThird(..))")
	private void doThirdPointcut(){}
}





























