package com.abc.di01;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:com/abc/di01/applicationContext.xml")
public class MyTest {
	@Resource(name="student")
	private Student student;
	
	@Autowired
	private School school;
	
	@Test
	public void test01() {
		System.out.println(student);
	}
	
	@Test
	public void test02() {
		System.out.println(school);
	}
	
}















