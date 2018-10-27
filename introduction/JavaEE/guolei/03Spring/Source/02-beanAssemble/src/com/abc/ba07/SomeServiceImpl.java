package com.abc.ba07;

public class SomeServiceImpl implements ISomeService {

	@Override
	public void doSome() {
		System.out.println("执行doSome()方法");
	}
	
	public void afterInit() {
		System.out.println("当前对象刚刚被初始化完毕");
	}
	
	public void beforeDestroy() {
		System.out.println("当前对象马上要被销毁了");
	}

}
