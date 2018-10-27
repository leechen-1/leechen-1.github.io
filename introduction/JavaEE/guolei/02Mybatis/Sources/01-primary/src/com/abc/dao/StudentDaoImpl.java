package com.abc.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.abc.beans.Student;

public class StudentDaoImpl implements IStudentDao {

	@Override
	public void insertStudent(Student student) {
		SqlSession session = null;
		try {
			// 1. 创建SqlSessionFactoryBuilder对象
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			// 2. 加载主配置文件
			InputStream is = Resources.getResourceAsStream("mybatis.xml");
			// 3. 创建SqlSessionFactory
			SqlSessionFactory factory = builder.build(is);
			// 4. 创建SqlSession对象
			session = factory.openSession();
			
			// 5. 执行命令
			session.insert("insertStu", student);
			
			// 6. SqlSession的提交
			session.commit();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 7. SqlSession的关闭
			if (session != null) {
				session.close();
			}
		}
	}

}
