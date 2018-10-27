package com.abc.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		for (int i = 1; i < 11; i++) {
			Student student = new Student("n_" + i, 15 + i, 85 + i);
			dao.insertStudent(student);
		}
		session.commit();
	}
	
	@Test
	public void test02() {
		Student student = new Student("李四", 24, 94.5);
		System.out.println("插入前：" + student);
		dao.insertStudentCatchId(student);
		System.out.println("插入后：" + student);
		session.commit();
	}

	@Test
	public void test03() {
		dao.deleteById(18);
		session.commit();
	}
	
	@Test
	public void test04() {
		Student student = new Student("赵六", 26, 96.5);
		student.setId(3);
		dao.updateStudent(student);
		session.commit();
	}
	
	@Test
	public void test05() {
		List<Student> students = dao.selectAllStudent();
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	// 注意：
	// Mapper的动态代理对象底层也是通过调用SqlSession的selectOne()或selectList()方法执行查询的
	// 但若方法的返回类型为List，则系统会调用selectList()方法，其它所有类型的返回值，系统调用的都是selectOne()。
	// 即系统调用selectOne()或selectList()方法的判别标准是方法的返回值类型是否为List
	/*
	@Test
	public void test06() {
		Map<Object, Student> map = dao.selectAllStudentMap();
		Student student = map.get("张三");
		System.out.println(student);
	}
	*/
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
	
	@Test
	public void test11() {
		
		List<Student> students = dao.selectStudentsByCondition3("张", 23);
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	
	
	
	
}























