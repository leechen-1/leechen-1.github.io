package com.abc.ba01;

public class SomeServiceImpl implements ISomeService {
	/*
	以下代码会使默认的无参构造器消失，容器将无法创建对象
	public SomeServiceImpl(int a) {
		System.out.println("执行SomeServiceImpl的无参构造器，创建SomeService对象");
	}
	*/
	@Override
	public void doSome() {
		System.out.println("执行doSome()方法");
	}

}




