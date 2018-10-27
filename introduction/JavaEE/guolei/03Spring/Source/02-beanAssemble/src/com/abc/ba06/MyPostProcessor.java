package com.abc.ba06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyPostProcessor implements BeanPostProcessor {

	// bean：当前正在被初始化的Bean
	// beanName：当前正在被初始化的Bean的id属性

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("---------- before -----------");
		
		if (beanName.equals("someService")) {
			Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(),
					new InvocationHandler() {

						@Override
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
							// 执行目标方法
							Object result = method.invoke(bean, args);
							if (method.getName().equals("doSome")) {
								// 增强结果
								result = ((String) result).toUpperCase();
							}
							return result;
						}
					});
			return proxy;
		}
		
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("---------- after -----------");
		return bean;
	}

}


