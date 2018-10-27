package com.abc.test;

import com.abc.xxx.Other;
import com.abc.xxx.Some;

public class MyTest {

	public static void main(String[] args) {
		Other other = new Other();
		Some some = new Some(other);
		some.doTest();
		
		// 发生回调
		other.doOther();
	}

}
