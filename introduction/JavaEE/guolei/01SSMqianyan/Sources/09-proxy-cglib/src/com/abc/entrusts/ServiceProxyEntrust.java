package com.abc.entrusts;

import java.lang.reflect.Method;

import com.abc.service.SomeServiceImpl;
import com.abc.utils.SystemUtils;

import net.sf.cglib.core.Signature;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

// 委托类
public class ServiceProxyEntrust implements MethodInterceptor {
	// 声明目标对象
	// 目标类实现业务接口
	/*
	private ISomeService target;
	public ServiceProxyEntrust(ISomeService target) {
		super();
		this.target = target;
	}
	*/
	
	// 目标类没有实现业务接口
	private SomeServiceImpl target;
	public ServiceProxyEntrust(SomeServiceImpl target) {
		super();
		this.target = target;
	}
	
	// 当执行代理对象的代理方法时，代理方法会调用该invoke()方法
	// obj：代理对象
	// method：目标方法
	// args：目标方法参数列表
	// proxy：目标方法的代理对象
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		String superName = proxy.getSuperName();
		Signature signature = proxy.getSignature();
		
		System.out.println("superName = " + superName);
		System.out.println("signature = " + signature);
		
		SystemUtils.doTx();
		// 执行目标方法
		Object result = method.invoke(target, args);
		SystemUtils.doLog();
		return result;
	}

}










