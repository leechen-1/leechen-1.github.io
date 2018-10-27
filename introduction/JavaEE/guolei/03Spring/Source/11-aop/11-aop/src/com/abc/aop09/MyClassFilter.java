package com.abc.aop09;

import org.springframework.aop.ClassFilter;

// 定义类过滤器
public class MyClassFilter implements ClassFilter {

	@Override
	public boolean matches(Class<?> clazz) {
		return clazz.isAssignableFrom(SomeServiceImpl.class);
	}

}
