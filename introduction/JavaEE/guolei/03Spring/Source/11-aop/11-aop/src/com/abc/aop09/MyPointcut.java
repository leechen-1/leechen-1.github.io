package com.abc.aop09;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;

// 定义切入点
public class MyPointcut implements Pointcut {
	private ClassFilter classFilter;
	private MethodMatcher methodMatcher;
	
	public void setClassFilter(ClassFilter classFilter) {
		this.classFilter = classFilter;
	}

	public void setMethodMatcher(MethodMatcher methodMatcher) {
		this.methodMatcher = methodMatcher;
	}

	@Override
	public ClassFilter getClassFilter() {
		return classFilter;
	}

	@Override
	public MethodMatcher getMethodMatcher() {
		return methodMatcher;
	}

}
