package com.abc.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.abc.beans.Student;
import com.abc.dao.IStudentDao;
import com.abc.utils.MybatisUtil;
public class MyTest {

	private IStudentDao dao;
	
	// 证明：二级缓存是存在的
	@Test
	public void test01() throws IOException {
		SqlSession session = MybatisUtil.getSession();
		dao = session.getMapper(IStudentDao.class);
		// 第一次查询
		Student student = dao.selectStudentById2(1);
		System.out.println("第一次查询：" + student);
		
		// 关闭一级缓存
		session.close();
		
		SqlSession session2 = MybatisUtil.getSession();
		dao = session2.getMapper(IStudentDao.class);
		// 第二次查询
		Student student2 = dao.selectStudentById2(1);
		System.out.println("第二次查询：" + student2);
		
		// 关闭一级缓存
		session2.close();
		
		SqlSession session3 = MybatisUtil.getSession();
		dao = session3.getMapper(IStudentDao.class);
		// 第三次查询
		Student student3 = dao.selectStudentById2(1);
		System.out.println("第三次查询：" + student3);
		
		// 关闭一级缓存
		session3.close();
	}
	
	
	@Test
	public void test02() {
		String path = System.getProperty("java.io.tmpdir");
		System.out.println(path);
	}

}























