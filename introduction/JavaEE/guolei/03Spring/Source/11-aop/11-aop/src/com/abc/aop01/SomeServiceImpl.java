package com.abc.aop01;

public class SomeServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		System.out.println("执行doFirst()方法");
	}

	@Override
	public void doSecond() {
		System.out.println("执行doSecond()方法");
	}

}
