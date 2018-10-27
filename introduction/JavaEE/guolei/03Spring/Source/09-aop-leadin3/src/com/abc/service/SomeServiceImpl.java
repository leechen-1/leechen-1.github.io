package com.abc.service;

public class SomeServiceImpl implements ISomeService {

	@Override
	public void doFirst() {
		ServiceUtils.doTx();
		System.out.println("执行doFirst()方法");
		ServiceUtils.doLog();
	}

	@Override
	public void doSecond() {
		ServiceUtils.doTx();
		System.out.println("执行doSecond()方法");
		ServiceUtils.doLog();
	}

}
