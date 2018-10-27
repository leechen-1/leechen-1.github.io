package com.abc.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.abc.beans.Student;
import com.abc.dao.IStudentDao;
import com.abc.utils.MybatisUtil;
/*
 * 	使用Mapper的动态代理要求：
 *  1）session.getMapper()中的参数为所要代理的接口类型
 *  2）映射文件的namespace属性值为所要代理的接口的全限定性类名
 *  3）映射文件中的statement的id名称必须要与接口中相应方法的名称相同
 * 
 */
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
		if(session != null) {
			session.close();
		}
	}
	
	@Test
	public void test01() {
		// Student student = new Student("张", 24, -1);
		// Student student = new Student(null, 24, -1);
		// Student student = new Student("张", -1, -1);
		Student student = new Student(null, -1, -1);
		List<Student> students = dao.selectStudentsByIf(student);
		for (Student stu : students) {
			System.out.println(stu);
		}
	}
	
	@Test
	public void test02() {
		Student student = new Student("张", 24, -1);
		// Student student = new Student(null, 24, -1);
		// Student student = new Student("张", -1, -1);
		// Student student = new Student(null, -1, -1);
		List<Student> students = dao.selectStudentsByWhere(student);
		for (Student stu : students) {
			System.out.println(stu);
		}
	}
	
	@Test
	public void test03() {
		// Student student = new Student("张", 24, -1);
		// Student student = new Student(null, 24, -1);
		// Student student = new Student("张", -1, -1);
		Student student = new Student(null, -1, -1);
		List<Student> students = dao.selectStudentsByChoose(student);
		for (Student stu : students) {
			System.out.println(stu);
		}
	}
	
	@Test
	public void test04() {
		int[] ids = {1,5,7};
		List<Student> students = dao.selectStudentsByForeachArray(ids);
		for (Student stu : students) {
			System.out.println(stu);
		}
	}
	
	@Test
	public void test05() {
		List<Integer> ids = new ArrayList<>();
		ids.add(1);
		ids.add(5);
		ids.add(7);
		List<Student> students = dao.selectStudentsByForeachList(ids);
		for (Student stu : students) {
			System.out.println(stu);
		}
	}
	
	@Test
	public void test06() {
		Student student = new Student();
		student.setId(1);
		Student student2 = new Student();
		student2.setId(5);
		Student student3 = new Student();
		student3.setId(7);
		
		List<Student> stus = new ArrayList<>();
		stus.add(student);
		stus.add(student2);
		stus.add(student3);
		
		List<Student> students = dao.selectStudentsByForeachList2(stus);
		for (Student stu : students) {
			System.out.println(stu);
		}
	}
	
	@Test
	public void test07() {
		Student student = new Student();
		student.setId(1);
		Student student2 = new Student();
		student2.setId(5);
		Student student3 = new Student();
		student3.setId(7);
		
		List<Student> stus = new ArrayList<>();
		stus.add(student);
		stus.add(student2);
		stus.add(student3);
		
		List<Student> students = dao.selectStudentsByFragment(stus);
		for (Student stu : students) {
			System.out.println(stu);
		}
	}
	
	
	
	
}























