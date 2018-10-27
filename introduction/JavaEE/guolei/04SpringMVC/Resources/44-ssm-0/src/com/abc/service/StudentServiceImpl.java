package com.abc.service;

import com.abc.beans.Student;
import com.abc.dao.IStudentDao;

public class StudentServiceImpl implements IStudentService {
	private IStudentDao dao;
	
	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}

	@Override
	public void saveStudent(Student student) {
		dao.insertStudent(student);
	}

}
