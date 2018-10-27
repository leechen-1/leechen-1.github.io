package com.abc.aop09;

import java.lang.reflect.Method;

import org.springframework.aop.MethodMatcher;

public class MyMethodMatcher implements MethodMatcher {

	// method：当前正在执行的目标方法
	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		// 判断当前正在执行的目标方法是否是指定的切入点方法
		String name = method.getName();
		if(name.equals("doFirst") || name.equals("doSecond")) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean isRuntime() {
		// 若目标方法中存在重载的方法，则让该方法返回true，否则，让其返回false
		return false;
	}

	// 当两个参数的matches()方法与isRuntime()方法均返回true时，框架才会调用该三个参数的matches()方法
	// args：当前正在执行的目标方法的参数列表
	@Override
	public boolean matches(Method method, Class<?> targetClass, Object... args) {
		return false;
	}

}
