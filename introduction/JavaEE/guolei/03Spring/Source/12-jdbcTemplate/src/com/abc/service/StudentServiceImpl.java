package com.abc.service;

import java.util.List;

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

	@Override
	public void removeStudentById(int id) {
		dao.deleteStudentById(id);
	}

	@Override
	public void modifyStudent(Student student) {
		dao.updateStudent(student);
	}

	@Override
	public String findStudentNameById(int id) {
		return dao.selectStudentNameById(id);
	}

	@Override
	public List<String> findAllStudentsName() {
		return dao.selectAllStudentsName();
	}

	@Override
	public Student findStudentById(int id) {
		return dao.selectStudentById(id);
	}

	@Override
	public List<Student> findAllStudents() {
		return dao.selectAllStudents();
	}

}
