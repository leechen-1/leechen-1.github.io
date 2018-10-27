package com.abc.dao;

import java.util.List;

import com.abc.beans.Student;

public interface IStudentDao {
	List<Student> selectStudentsByIf(Student student);
	List<Student> selectStudentsByWhere(Student student);
	List<Student> selectStudentsByChoose(Student student);
	List<Student> selectStudentsByForeachArray(int[] ids);
	List<Student> selectStudentsByForeachList(List<Integer> ids);
	List<Student> selectStudentsByForeachList2(List<Student> students);
	List<Student> selectStudentsByFragment(List<Student> students);
}



