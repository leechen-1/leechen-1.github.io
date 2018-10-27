package com.abc.proxy;

import com.abc.service.ISomeService;
import com.abc.service.SomeServiceImpl;
import com.abc.utils.SystemUtils;

// 代理类
public class ServiceProxy implements ISomeService {
	private ISomeService target;
	public ServiceProxy() {
		target = new SomeServiceImpl();
	}

	// 代理方法
	@Override
	public String doSome(int a, String b) {
		SystemUtils.doTx();
		// 调用目标类的目标方法
		String result = target.doSome(a, b);
		SystemUtils.doLog();
		return result;
	}
	// 代理方法
	@Override
	public void doOther() {
		SystemUtils.doTx();
		// 调用目标类的目标方法
		target.doOther();
		SystemUtils.doLog();
	}
}























