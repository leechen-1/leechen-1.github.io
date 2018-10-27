package com.abc.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.abc.beans.Country;
import com.abc.dao.ICountryDao;
import com.abc.utils.MybatisUtil;
public class MyTest {

	private ICountryDao dao;
	private SqlSession session;

	@Before
	public void before() throws IOException {
		session = MybatisUtil.getSession();
		dao = session.getMapper(ICountryDao.class);
	}
	
	@After
	public void after() {
		if(session != null) {
			session.close();
		}
	}
	
	@Test
	public void test01() {
		Country country = dao.selectCountryById(1);
		System.out.println(country);
	}
	
	
	
	
}























