package com.abc.ba06;

public class SomeServiceImpl implements ISomeService {

	@Override
	public String doSome() {
		System.out.println("执行doSome()方法");
		return "aynu";
	}

	@Override
	public String doOther() {
		System.out.println("执行doOther()方法");
		return "rjxy";
	}

}
