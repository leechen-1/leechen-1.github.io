package com.abc.ba05;

public class SomeServiceImpl implements ISomeService {

	public SomeServiceImpl() {
		System.out.println("-------------");
	}

	@Override
	public void doSome() {
		System.out.println("执行doSome()方法");
	}

}
