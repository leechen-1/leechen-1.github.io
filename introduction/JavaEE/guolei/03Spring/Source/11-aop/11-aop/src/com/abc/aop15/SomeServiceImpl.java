package com.abc.aop15;

// 目标类
public class SomeServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		System.out.println("执行SomeServiceImpl类的doFirst()方法");
	}

	@Override
	public String doSecond() {
		System.out.println("执行SomeServiceImpl类的doSecond()方法");
		return "aynu";
	}

	@Override
	public void doThird() {
		// System.out.println("执行SomeServiceImpl类的doThird()方法");
		System.out.println("执行SomeServiceImpl类的doThird()方法" + 3 / 0);
	}

}
