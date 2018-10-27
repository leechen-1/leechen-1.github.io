package com.abc.test;

import java.io.IOException;

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
		if(session != null) {
			session.close();
		}
	}
	
	// 证明：一级缓存是存在的
	@Test
	public void test01() {
		// 第一次查询
		Student student = dao.selectStudentById(1);
		System.out.println("第一次查询：" + student);
		
		// 第二次查询
		Student student2 = dao.selectStudentById(1);
		System.out.println("第二次查询：" + student2);
	}
	
	// 证明：一级缓存中存放的不是查询出的对象本身，而是一个Map。
	// 一级缓存的底层实现是一个Map
	// key：hashCode + statementId + SQL语句
	// value：查询结果
	@Test
	public void test02() {
		// 第一次查询
		Student student = dao.selectStudentById(1);
		System.out.println("第一次查询：" + student);
		
		// 第二次查询
		Student student2 = dao.selectStudentById2(1);
		System.out.println("第二次查询：" + student2);
	}
	
	// 证明：增删改操作会刷新一级缓存（清空一级缓存）
	@Test
	public void test03() {
		// 第一次查询
		Student student = dao.selectStudentById(1);
		System.out.println("第一次查询：" + student);
		
		// 插入一个对象
		dao.insertStudent(new Student());
		
		// 第二次查询
		Student student2 = dao.selectStudentById(1);
		System.out.println("第二次查询：" + student2);
	}

}























