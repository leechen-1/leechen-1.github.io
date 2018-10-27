package com.abc.aop11;

// 目标类
public class SomeServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		System.out.println("执行SomeServiceImpl类的doFirst()方法");
	}

	@Override
	public void doSecond() {
		System.out.println("执行SomeServiceImpl类的doSecond()方法");
	}

	@Override
	public void doThird() {
		System.out.println("执行SomeServiceImpl类的doThird()方法");
	}

}
