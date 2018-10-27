package com.abc.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.abc.beans.NewsLabel;
import com.abc.dao.INewsLabelDao;
import com.abc.utils.MybatisUtil;
public class MyTest {

	private INewsLabelDao dao;
	private SqlSession session;

	@Before
	public void before() throws IOException {
		session = MybatisUtil.getSession();
		dao = session.getMapper(INewsLabelDao.class);
	}
	
	@After
	public void after() {
		if(session != null) {
			session.close();
		}
	}
	
	@Test
	public void test01() {
		NewsLabel newslabel = dao.selectNewsLabelById(2);
		System.out.println(newslabel);
	}
	
}























