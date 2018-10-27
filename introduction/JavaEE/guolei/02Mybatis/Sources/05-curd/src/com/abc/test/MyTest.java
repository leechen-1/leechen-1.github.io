package com.abc.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.abc.beans.Student;
import com.abc.dao.IStudentDao;
import com.abc.dao.StudentDaoImpl;

public class MyTest {

	private IStudentDao dao;

	@Before
	public void before() {
		dao = new StudentDaoImpl();
	}
	
	@Test
	public void test01() {
		for (int i = 1; i < 11; i++) {
			Student student = new Student("n_" + i, 15 + i, 85 + i);
			dao.insertStudent(student);
		}
	}
	
	@Test
	public void test02() {
		Student student = new Student("李四", 24, 94.5);
		System.out.println("插入前：" + student);
		dao.insertStudentCatchId(student);
		System.out.println("插入后：" + student);
	}

	@Test
	public void test03() {
		dao.deleteById(18);
	}
	
	@Test
	public void test04() {
		Student student = new Student("赵六", 26, 96.5);
		student.setId(3);
		dao.updateStudent(student);
	}
	
	@Test
	public void test05() {
		List<Student> students = dao.selectAllStudent();
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	@Test
	public void test06() {
		Map<Object, Student> map = dao.selectAllStudentMap();
		Student student = map.get("张三");
		System.out.println(student);
	}
	
	@Test
	public void test07() {
		Student student = dao.selectStudentById(3);
		System.out.println(student);
	}
	
	
	@Test
	public void test08() {
		List<Student> students = dao.selectStudentsByName("张");
		// SQL注入的写法
		// List<Student> students = dao.selectStudentsByName("张%' or 1=1 or '");
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	@Test
	public void test09() {
		// 将复合的查询条件封装到Student对象中
		Student stu = new Student("张", 23, -1);
		List<Student> students = dao.selectStudentsByCondition(stu);
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	@Test
	public void test10() {
		Student stu1 = new Student("张", 0, 0);
		Student stu2 = new Student(null, 23, 0);
		
		// 将复合的查询条件封装到Map中
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cname", "张");
		map.put("cage", 23);
		map.put("stu1", stu1);
		map.put("stu2", stu2);
		
		List<Student> students = dao.selectStudentsByCondition2(map);
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	
	
	
	
	
}























