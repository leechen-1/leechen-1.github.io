package com.abc.aop09;

// 目标类
public class OtherServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		System.out.println("执行OtherServiceImpl类的doFirst()方法");
	}

	@Override
	public void doSecond() {
		System.out.println("执行OtherServiceImpl类的doSecond()方法");
	}

	@Override
	public void doThird() {
		System.out.println("执行OtherServiceImpl类的doThird()方法");
	}

}
