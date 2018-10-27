package com.abc.aop12;

// 目标类
public class SomeServiceImpl implements ISomeService {

	// 目标方法
	@Override
	public void doSome() {
		System.out.println("执行目标对象的目标方法doSome()");
	}

}
