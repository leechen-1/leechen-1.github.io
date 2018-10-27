package com.abc.xxx;

// 普通方法
public class Other {
	public void doOther(ISome some) {
		System.out.println("执行Other类的doOther()方法");
		some.doSome();
	}
}
