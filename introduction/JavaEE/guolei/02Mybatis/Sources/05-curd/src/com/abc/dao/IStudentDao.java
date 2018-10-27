package com.abc.dao;

import java.util.List;
import java.util.Map;

import com.abc.beans.Student;

public interface IStudentDao {
	void insertStudent(Student student);
	// 可以获取到新插入的id
	void insertStudentCatchId(Student student);
	
	void deleteById(int id);
	void updateStudent(Student student);
	
	List<Student> selectAllStudent();
	Map<Object, Student> selectAllStudentMap();
	
	Student selectStudentById(int id);
	List<Student> selectStudentsByName(String name);
	
	List<Student> selectStudentsByCondition(Student student);
	List<Student> selectStudentsByCondition2(Map<String, Object> map);
	List<Student> selectStudentsByCondition3(String name, int age);
	
}



