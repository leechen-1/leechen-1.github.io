package com.abc.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/*
 * 	注意，工具类中的异常一般是要抛出给调用者的，不应try-catch。
 * 
 */

public class MybatisUtil {
	
	private static SqlSessionFactory factory;

	public static SqlSession getSession() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		if (factory == null) {
			factory = new SqlSessionFactoryBuilder().build(is);
		}
		return factory.openSession();
	}
	
}
