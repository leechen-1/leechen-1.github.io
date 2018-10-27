package com.abc.aop02;

public class SomeServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		System.out.println("执行doFirst()方法");
	}

	@Override
	public String doSecond() {
		System.out.println("执行doSecond()方法");
		return "rjsy";
	}

}
