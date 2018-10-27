package com.abc.ba08;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyPostProcessor implements BeanPostProcessor {

	// bean：当前正在被初始化的Bean
	// beanName：当前正在被初始化的Bean的id属性

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("可控点05：Bean后处理器的-- before --方法");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("可控点08：Bean后处理器的-- after --方法");
		return bean;
	}

}


