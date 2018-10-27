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
	
	@Test
	public void test01() {
		Student student = dao.selectStudentById(2);
		System.out.println(student);
	}
	
}























