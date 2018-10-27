package com.abc.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.abc.beans.Country;
import com.abc.beans.Minister;
import com.abc.dao.IMinisterDao;
import com.abc.utils.MybatisUtil;
public class MyTest {

	private IMinisterDao dao;
	private SqlSession session;

	@Before
	public void before() throws IOException {
		session = MybatisUtil.getSession();
		dao = session.getMapper(IMinisterDao.class);
	}
	
	@After
	public void after() {
		if(session != null) {
			session.close();
		}
	}
	
	@Test
	public void test01() {
		Minister minister = dao.selectMinisterById(2);
		System.out.println(minister);
	}
	
}























