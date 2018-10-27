package com.abc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abc.beans.Student;
import com.abc.dao.IStudentDao;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private IStudentDao dao;
	
	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}

	@Transactional
	@Override
	public void saveStudent(Student student) {
		dao.insertStudent(student);
	}

}
