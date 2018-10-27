package com.abc.service;

public class SomeServiceImpl implements ISomeService {

	@Override
	public void doSome() {
		System.out.println("执行doSome()方法");
	}

	@Override
	public void doOther() {
		System.out.println("执行doOther()方法");
	}

}
