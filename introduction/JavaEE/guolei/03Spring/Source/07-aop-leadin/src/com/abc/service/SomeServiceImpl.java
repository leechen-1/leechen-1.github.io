package com.abc.service;

public class SomeServiceImpl implements ISomeService {

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

	public void doLog() {
		System.out.println("记录日志");
	}

	public void doTx() {
		System.out.println("开启事务");
	}

}
