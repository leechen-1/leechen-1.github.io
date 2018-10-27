package com.abc.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.beans.Student;
import com.abc.service.IStudentService;

public class MyTest {
	
	private IStudentService service;

	@Before
	public void before() {
		String config = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(config);
		service = (IStudentService) ac.getBean("studentService");
	}
	
	@Test
	public void test01() {
		Student student = new Student("张三", 23);
		service.saveStudent(student);
	}
	
	@Test
	public void test02() {
		service.removeStudentById(2);
	}
	
	@Test
	public void test03() {
		Student student = new Student("王五", 25);
		student.setId(1);
		service.modifyStudent(student);
	}
	
	@Test
	public void test04() {
		String name = service.findStudentNameById(1);
		System.out.println(name);
	}
	
	@Test
	public void test05() {
		List<String> names = service.findAllStudentsName();
		for (String name : names) {
			System.out.println(name);
		}
	}
	
	@Test
	public void test06() {
		Student student = service.findStudentById(3);
		System.out.println(student);
	}
	
	@Test
	public void test07() {
		List<Student> students = service.findAllStudents();
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	
}















