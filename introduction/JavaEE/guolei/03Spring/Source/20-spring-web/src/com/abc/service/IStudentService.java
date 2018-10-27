package com.abc.service;

import java.util.List;

import com.abc.beans.Student;

public interface IStudentService {
	void saveStudent(Student student);
	void removeStudentById(int id);
	void modifyStudent(Student student);
	
	Student findStudentById(int id);
	List<Student> findAllStudents();
}
