package com.abc.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.abc.beans.Student;
import com.abc.dao.IStudentDao;
import com.abc.utils.MybatisUtil;
public class MyTest {

	private IStudentDao dao;
	private SqlSession session;
	
	@Before
	public void before() throws IOException {
		session = MybatisUtil.getSession();
		dao = session.getMapper(IStudentDao.class);
	}
	
	@After
	public void after() {
		if (session != null) {
			session.close();
		}
	}
	

	@Test
	public void test05() {
		List<Student> students = dao.selectAllStudents();
		for (Student student : students) {
			System.out.println(student);
		}
	}

	@Test
	public void test06() {
		Student student = dao.selectStudentById(4);
		System.out.println(student);
	}
	
	@Test
	public void test07() {
		// Student stu = new Student("李", -1, -1);
		Student stu = new Student("李", 23, -1);
		List<Student> students = dao.selectStudentByCondition(stu);
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	@Test
	public void test08() {
		List<Student> students = dao.selectStudentByCondition2("李", 23, 120);
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	@Test
	public void test01() {
		Student student = new Student("王五", 25, 95.5);
		dao.insertStudent(student);
		session.commit();
	}
	
	@Test
	public void test02() {
		Student student = new Student("王五", 25, 95.5);
		System.out.println("插入前：" + student);
		dao.insertStudentCatcheId(student);
		System.out.println("插入后：" + student);
		session.commit();
	}
	
	@Test
	public void test03() {
		dao.deleteById(1);
		session.commit();
	}

	@Test
	public void test04() {
		Student student = new Student();
		student.setName("赵六");
		student.setId(3);
		dao.updateStudent(student);
		session.commit();
	}
	
	@Test
	public void test041() {
		Student student = new Student();
		student.setId(2);
		dao.updateStudent2(student);
		session.commit();
	}
	
	@Test
	public void test042() {
		Student student = new Student();
		student.setName("赵大六");
		student.setId(2);
		dao.updateStudent3(student);
		session.commit();
	}
	
}























