package com.abc.xxx;

public class Some implements ISome {

	public void doTest() {
		Other other = new Other();
		// 调用普通类的一个方法
		other.doOther(this);
	}
	
	
	// 回调方法
	@Override
	public void doSome() {
		System.out.println("执行回调方法");
	}

}
