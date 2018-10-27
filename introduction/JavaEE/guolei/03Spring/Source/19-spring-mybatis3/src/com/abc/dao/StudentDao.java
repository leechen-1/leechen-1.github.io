package com.abc.dao;

import java.util.List;

import com.abc.beans.Student;

public interface StudentDao {
	void insertStudent(Student student);
	void deleteStudentById(int id);
	void updateStudent(Student student);
	
	Student selectStudentById(int id);
	List<Student> selectAllStudents();
}
