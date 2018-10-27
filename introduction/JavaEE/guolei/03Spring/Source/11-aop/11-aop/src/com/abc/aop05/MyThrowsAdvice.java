package com.abc.aop05;

import org.springframework.aop.ThrowsAdvice;

// 异常通知
public class MyThrowsAdvice implements ThrowsAdvice {
	// 异常通知方法
	public void afterThrowing(UsernameException ex) {
		System.out.println("执行UsernameException异常通知方法  ex = " + ex.getMessage());
	}

	public void afterThrowing(PasswordException ex) {
		System.out.println("执行PasswordException异常通知方法  ex = " + ex.getMessage());
	}

	public void afterThrowing(Exception ex) {
		System.out.println("执行异常通知方法  ex = " + ex.getMessage());
	}

}
