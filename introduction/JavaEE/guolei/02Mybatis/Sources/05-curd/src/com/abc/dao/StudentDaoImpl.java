package com.abc.dao;

import java.io.IOException;
import java.util.List;
import java.util.Map;

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
			session.insert("insertStudent", student);
			
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

	@Override
	public void insertStudentCatchId(Student student) {
		SqlSession session = null;
		try {
			// 1. 创建SqlSession对象
			session = MybatisUtil.getSession();
			
			// 2. 执行命令
			session.insert("insertStudentCatchId", student);
			
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
	@Override
	public void deleteById(int id) {
		SqlSession session = null;
		try {
			// 1. 创建SqlSession对象
			session = MybatisUtil.getSession();
			
			// 2. 执行命令
			session.delete("deleteById", id);
			
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

	@Override
	public void updateStudent(Student student) {
		SqlSession session = null;
		try {
			// 1. 创建SqlSession对象
			session = MybatisUtil.getSession();
			
			// 2. 执行命令
			session.update("updateStudent", student);
			
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

	@Override
	public List<Student> selectAllStudent() {
		List<Student> students = null;
		SqlSession session = null;
		try {
			// 1. 创建SqlSession对象
			session = MybatisUtil.getSession();
			
			// 2. 执行命令
			students = session.selectList("selectAllStudent");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. SqlSession的关闭
			if (session != null) {
				session.close();
			}
		}
		return students;
	}
	
	@Override
	public Map<Object, Student> selectAllStudentMap() {
		Map<Object,Student> map = null;
		SqlSession session = null;
		try {
			// 1. 创建SqlSession对象
			session = MybatisUtil.getSession();
			
			// 2. 执行命令
			map = session.selectMap("selectAllStudent", "name");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. SqlSession的关闭
			if (session != null) {
				session.close();
			}
		}
		return map;
	}

	@Override
	public Student selectStudentById(int id) {
		Student student = null;
		SqlSession session = null;
		try {
			// 1. 创建SqlSession对象
			session = MybatisUtil.getSession();
			
			// 2. 执行命令
			student = session.selectOne("selectStudentById", id);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. SqlSession的关闭
			if (session != null) {
				session.close();
			}
		}
		return student;
	}

	@Override
	public List<Student> selectStudentsByName(String name) {
		List<Student> students = null;
		SqlSession session = null;
		try {
			// 1. 创建SqlSession对象
			session = MybatisUtil.getSession();
			
			// 2. 执行命令
			students = session.selectList("selectStudentsByName", name);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. SqlSession的关闭
			if (session != null) {
				session.close();
			}
		}
		return students;
	}

	@Override
	public List<Student> selectStudentsByCondition(Student student) {
		List<Student> students = null;
		SqlSession session = null;
		try {
			// 1. 创建SqlSession对象
			session = MybatisUtil.getSession();
			
			// 2. 执行命令
			students = session.selectList("selectStudentsByCondition", student);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. SqlSession的关闭
			if (session != null) {
				session.close();
			}
		}
		return students;
	}

	@Override
	public List<Student> selectStudentsByCondition2(Map<String, Object> map) {
		List<Student> students = null;
		SqlSession session = null;
		try {
			// 1. 创建SqlSession对象
			session = MybatisUtil.getSession();
			
			// 2. 执行命令
			students = session.selectList("selectStudentsByCondition2", map);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. SqlSession的关闭
			if (session != null) {
				session.close();
			}
		}
		return students;
	}

	@Override
	public List<Student> selectStudentsByCondition3(String name, int age) {
		List<Student> students = null;
		SqlSession session = null;
		try {
			// 1. 创建SqlSession对象
			session = MybatisUtil.getSession();
			
			// 2. 执行命令
			// students = session.selectList("selectStudentsByCondition3", map);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. SqlSession的关闭
			if (session != null) {
				session.close();
			}
		}
		return students;
	}

}
