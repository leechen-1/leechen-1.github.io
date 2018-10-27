package com.abc.service;

public class SomeServiceImpl implements ISomeService {

	public SomeServiceImpl() {
		System.out.println("执行SomeServiceImpl的无参构造器，创建SomeService对象");
	}

	@Override
	public void doSome() {
		System.out.println("执行doSome()方法");
	}

}




