package com.abc.aop04;

import org.springframework.aop.ThrowsAdvice;

// 异常通知
public class MyThrowsAdvice implements ThrowsAdvice {
	// 异常通知方法
	public void afterThrowing(Exception ex) {
		System.out.println("执行异常通知方法  ex = " + ex.getMessage());
	}
}
