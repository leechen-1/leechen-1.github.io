package com.abc.dao;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.abc.beans.Student;

public class StudentDaoImpl extends JdbcDaoSupport implements IStudentDao {
	
	@Override
	public void insertStudent(Student student) {
		String sql = "insert into student(name,age) values(?,?)";
		this.getJdbcTemplate().update(sql, student.getName(), student.getAge());
	}

	@Override
	public void deleteStudentById(int id) {
		String sql = "delete from student where id=?";
		this.getJdbcTemplate().update(sql, id);
	}

	@Override
	public void updateStudent(Student student) {
		String sql = "update student set name=?, age=? where id=?";
		this.getJdbcTemplate().update(sql, student.getName(), student.getAge(), student.getId());
	}

	@Override
	public String selectStudentNameById(int id) {
		String sql = "select name from student where id=?";
		Object[] args = {id};
		return this.getJdbcTemplate().queryForObject(sql, args, String.class);
	}

	@Override
	public List<String> selectAllStudentsName() {
		String sql = "select name from student";
		return this.getJdbcTemplate().queryForList(sql, String.class);
	}

	@Override
	public Student selectStudentById(int id) {
		String sql = "select id,name,age from student where id=?";
		Object[] args = {id};
		return this.getJdbcTemplate().queryForObject(sql, args, new StudentRowMapper());
	}

	@Override
	public List<Student> selectAllStudents() {
		String sql = "select id,name,age from student";
		return this.getJdbcTemplate().query(sql, new StudentRowMapper());
	}

}



























