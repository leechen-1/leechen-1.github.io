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
		Student student = dao.selectStudentById(1);
		System.out.println("第一次查询：" + student);
		
		// 关闭一级缓存
		session.close();
		
		SqlSession session2 = MybatisUtil.getSession();
		dao = session2.getMapper(IStudentDao.class);
		// 第二次查询
		Student student2 = dao.selectStudentById(1);
		System.out.println("第二次查询：" + student2);
		
		// 关闭一级缓存
		session2.close();
		
		SqlSession session3 = MybatisUtil.getSession();
		dao = session3.getMapper(IStudentDao.class);
		// 第三次查询
		Student student3 = dao.selectStudentById(1);
		System.out.println("第三次查询：" + student3);
		
		// 关闭一级缓存
		session3.close();
	}
	
	// 证明：增删改操作对二级缓存的影响
	// 增删改操作会刷新（清空）二级缓存
	// 1）刷新二级缓存到底执行了些什么？
	// 二级缓存的底层也是Map
	// key：hashCode + statementId + SQL
	// value：查询结果
	// 刷新二级缓存实质上是将二级缓存中的所有的Entry对象的value置为null
	// 并未删除整个Entry对象，即key仍保留
	// 2）到底何时执行到DB的Select查询？
	// 有两种情况可以到DB中执行真正的查询
	//   1> Map中根本就不存在要查找的Entry，即没有要查找的key
	//   2> Map中存在要查找的key，但其value为null
	// 3）增删改操作默认是可以影响二级缓存的，但也可让其不影响
	//  只需在增删改的Statement中添加flushCache="false"属性即可
	
	@Test
	public void test02() throws IOException {
		SqlSession session = MybatisUtil.getSession();
		dao = session.getMapper(IStudentDao.class);
		// 第一次查询
		Student student = dao.selectStudentById(1);
		System.out.println("第一次查询：" + student);
		
		// 关闭一级缓存
		session.close();
		
		SqlSession session2 = MybatisUtil.getSession();
		dao = session2.getMapper(IStudentDao.class);
		
		// 执行增删改操作
		dao.insertStudent(new Student());
		
		// 第二次查询
		Student student2 = dao.selectStudentById(1);
		System.out.println("第二次查询：" + student2);
		
		// 关闭一级缓存
		session2.close();
	}

}























