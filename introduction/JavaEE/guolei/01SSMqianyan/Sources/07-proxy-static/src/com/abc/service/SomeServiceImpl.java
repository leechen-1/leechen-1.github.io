package com.abc.service;

// 目标类
public class SomeServiceImpl implements ISomeService {

	// 目标方法
	@Override
	public String doSome(int a, String b) {
		System.out.println("执行业务方法doSome()");
		return a + b;
	}

	// 目标方法
	@Override
	public void doOther() {
		System.out.println("执行业务方法doOther()");
	}

}

