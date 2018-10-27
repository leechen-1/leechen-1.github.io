package com.abc.dao;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.abc.beans.Student;
import com.abc.utils.MybatisUtil;

public class StudentDaoImpl implements IStudentDao {

	@Override
	public void insertStudent(Student student) {
		SqlSession session = null;
		try {
			// 1. 创建SqlSession对象
			session = MybatisUtil.getSession();
			
			// 2. 执行命令
			session.insert("insertStu", student);
			
			// 3. SqlSession的提交
			session.commit();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4. SqlSession的关闭
			if (session != null) {
				session.close();
			}
		}
	}

}
