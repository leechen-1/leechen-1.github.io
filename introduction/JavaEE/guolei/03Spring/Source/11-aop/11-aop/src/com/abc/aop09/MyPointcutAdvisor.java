package com.abc.aop09;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;

// 定义切入点顾问
public class MyPointcutAdvisor implements PointcutAdvisor {
	private Advice advice;
	private Pointcut pointcut;
	
	public void setAdvice(Advice advice) {
		this.advice = advice;
	}

	public void setPointcut(Pointcut pointcut) {
		this.pointcut = pointcut;
	}

	@Override
	public Advice getAdvice() {
		return advice;
	}

	// 该方法Spring框架没有启用
	@Override
	public boolean isPerInstance() {
		return false;
	}

	@Override
	public Pointcut getPointcut() {
		return pointcut;
	}

}
