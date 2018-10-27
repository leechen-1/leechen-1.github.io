package com.abc.aop12;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.IntroductionInterceptor;

// 引入通知
public class MyIntroductionAdvice implements IOtherService, IntroductionInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		String name = mi.getMethod().getName();
		if ("doSome".equals(name)) {
			// 调用目标对象的目标方法
			// mi.proceed()等价于：mi.getMethod().invoke(target,mi.getArguments());
			return mi.proceed();
		}
		// 调用新增的doOther()方法
		return mi.getMethod().invoke(this, mi.getArguments());
	}

	@Override
	public boolean implementsInterface(Class<?> intf) {
		return intf.isAssignableFrom(IOtherService.class);
	}

	@Override
	public void doOther() {
		System.out.println("执行新增方法doOther()");
	}

}
