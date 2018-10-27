package com.abc.service;

public class SomeServiceImpl extends BaseService implements ISomeService {

	@Override
	public void doFirst() {
		doTx();
		System.out.println("执行doFirst()方法");
		doLog();
	}

	@Override
	public void doSecond() {
		doTx();
		System.out.println("执行doSecond()方法");
		doLog();
	}

}
