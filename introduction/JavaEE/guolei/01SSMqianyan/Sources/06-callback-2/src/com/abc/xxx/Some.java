package com.abc.xxx;

public class Some implements ISome {
	private Other other;
	
	public Some(Other other) {
		this.other = other;
	}


	public void doTest() {
		// 调用普通类的一个方法
		other.setCallback(this);
	}
	
	
	// 回调方法
	@Override
	public void doSome() {
		System.out.println("执行回调方法");
	}

}
