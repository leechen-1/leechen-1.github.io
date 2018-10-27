package com.abc.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.abc.beans.Husband;
import com.abc.dao.IHusbandDao;
import com.abc.utils.MybatisUtil;
public class MyTest {

	private IHusbandDao dao;
	private SqlSession session;

	@Before
	public void before() throws IOException {
		session = MybatisUtil.getSession();
		dao = session.getMapper(IHusbandDao.class);
	}
	
	@After
	public void after() {
		if(session != null) {
			session.close();
		}
	}
	
	@Test
	public void test01() {
		Husband husband = dao.selectHusbandById(2);
		System.out.println(husband);
	}
	
}























