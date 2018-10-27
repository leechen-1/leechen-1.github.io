package com.abc.dao;

import java.util.List;

import com.abc.beans.Student;

public interface IStudentDao {
	List<Student> selectStudentById(int sid);
}



