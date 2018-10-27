package com.abc.dao;

import org.apache.ibatis.annotations.Insert;

import com.abc.beans.Student;

public interface IStudentDao {

	@Insert("insert into student(name, age) values(#{name}, #{age})")
	void insertStudent(Student student);

}
