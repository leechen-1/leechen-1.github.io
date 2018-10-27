package com.abc.service;

import java.util.List;

import com.abc.beans.Student;
import com.abc.dao.StudentDao;

public class StudentServiceImpl implements IStudentService {
	private StudentDao dao;
	
	public void setDao(StudentDao dao) {
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
	public Student findStudentById(int id) {
		return dao.selectStudentById(id);
	}

	@Override
	public List<Student> findAllStudents() {
		return dao.selectAllStudents();
	}

}
