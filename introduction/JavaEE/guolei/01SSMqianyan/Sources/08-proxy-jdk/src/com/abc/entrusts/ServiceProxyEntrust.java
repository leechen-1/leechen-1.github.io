package com.abc.entrusts;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.abc.service.ISomeService;
import com.abc.utils.SystemUtils;

// 委托类
public class ServiceProxyEntrust implements InvocationHandler {
	// 声明目标对象
	private ISomeService target;
	
	public ServiceProxyEntrust(ISomeService target) {
		super();
		this.target = target;
	}
	
	// 当执行代理对象的代理方法时，代理方法会调用该invoke()方法
	// proxy：代理对象
	// method：目标方法
	// args：目标方法参数列表
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) 
			throws Throwable {
		SystemUtils.doTx();
		// 执行目标方法
		Object result = method.invoke(target, args);
		SystemUtils.doLog();
		return result;
	}

}









