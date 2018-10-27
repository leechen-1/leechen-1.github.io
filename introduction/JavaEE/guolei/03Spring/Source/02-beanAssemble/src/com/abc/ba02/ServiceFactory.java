package com.abc.ba02;

// 动态工厂
public class ServiceFactory {
	
	public ISomeService getSomeService() {
		return new SomeServiceImpl();
	}
	
}



