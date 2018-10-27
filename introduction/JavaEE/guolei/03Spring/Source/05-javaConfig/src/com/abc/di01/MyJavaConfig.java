package com.abc.di01;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration     // 表示当前类充当Spring容器
public class MyJavaConfig {
	
	// @Bean(value="student", autowire=Autowire.BY_TYPE)
	@Bean(value="student", autowire=Autowire.BY_NAME)
	public Student xxx() {
		return new Student("张三", 23);
	}
	
	@Bean("mySchool")
	public School ooo() {
		return new School("安阳师院");
	}
	
	@Bean("school")
	public School jjj() {
		return new School("清华大学");
	}
	
}
