package com.abc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.abc.beans.Student;

// Jdbc模板对象是多例的，会为每一个线程创建一个模板对象。当线程结束时，会销毁这个模板对象。
// 一个方法就是一个线程。
public class StudentDaoImpl2 extends JdbcDaoSupport implements IStudentDao {
	private JdbcTemplate jt;
	
	public StudentDaoImpl2() {
		jt = this.getJdbcTemplate();
	}

	@Override
	public void insertStudent(Student student) {
		String sql = "insert into student(name,age) values(?,?)";
		jt.update(sql, student.getName(), student.getAge());
	}

	@Override
	public void deleteStudentById(int id) {
		String sql = "delete from student where id=?";
		jt.update(sql, id);
	}

	@Override
	public void updateStudent(Student student) {
		String sql = "update student set name=?, age=? where id=?";
		jt.update(sql, student.getName(), student.getAge(), student.getId());
	}

	@Override
	public String selectStudentNameById(int id) {
		String sql = "select name from student where id=?";
		Object[] args = {id};
		return jt.queryForObject(sql, args, String.class);
	}

	@Override
	public List<String> selectAllStudentsName() {
		String sql = "select name from student";
		return jt.queryForList(sql, String.class);
	}

	@Override
	public Student selectStudentById(int id) {
		String sql = "select id,name,age from student where id=?";
		Object[] args = {id};
		return jt.queryForObject(sql, args, new StudentRowMapper());
	}

	@Override
	public List<Student> selectAllStudents() {
		String sql = "select id,name,age from student";
		return jt.query(sql, new StudentRowMapper());
	}

}



























