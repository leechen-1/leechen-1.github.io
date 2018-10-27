package com.abc.test;

import com.abc.beans.Student;
import com.abc.dao.IStudentDao;
import com.abc.dao.StudentDaoImpl;

public class MyTest {

	public static void main(String[] args) {
		
		Student student = new Student("张三", 23, 93.5);
		
		IStudentDao dao = new StudentDaoImpl();
		dao.insertStudent(student);
	}

}
