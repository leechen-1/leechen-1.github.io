package com.abc.ba08;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SomeServiceImpl implements ISomeService, BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
	private String adao;
	private String bdao;

	public void setAdao(String adao) {
		System.out.println("可控点02：setter");
		this.adao = adao;
	}

	public void setBdao(String bdao) {
		System.out.println("可控点02：setter");
		this.bdao = bdao;
	}

	public SomeServiceImpl() {
		System.out.println("可控点01：无参构造器");
	}

	@Override
	public void doSome() {
		System.out.println("可控点09：执行业务方法");
	}

	public void afterInit() {
		System.out.println("可控点07：当前对象刚刚被初始化完毕");
	}

	public void beforeDestroy() {
		System.out.println("可控点11：当前对象马上要被销毁了");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("可控点03：beanId = " + name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("可控点04：获取当前的Spring容器对象");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("可控点06：当前Bean被初始化完毕了");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("可控点10：Bean销毁前的方法");
	}

}
