package com.abc.xxx;

// 普通方法
public class Other {
	private ISome some;
	
	// 初始化回调对象
	public void setCallback(ISome some) {
		System.out.println("Other类的回调对象已被初始化");
		this.some = some;
	}
	
	
	public void doOther() {
		System.out.println("执行Other类的doOther()方法");
		// 方法回调
		some.doSome();
	}
}
