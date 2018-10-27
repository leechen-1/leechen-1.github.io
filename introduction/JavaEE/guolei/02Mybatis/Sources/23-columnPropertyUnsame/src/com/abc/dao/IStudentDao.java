package com.abc.dao;

import com.abc.beans.Student;

public interface IStudentDao {
	void insertStudent(Student student);
	void deleteById(int id);
	void updateStudent(Student student);
	
	Student selectStudentById(int id);
}



