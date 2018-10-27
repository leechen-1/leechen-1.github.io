package com.abc.beans;

public class Middle {
	private Integer id;
	// 关联属性
	private Student student;
	// 关联属性
	private Course course;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Middle [course=" + course + "]";
	}
	
}
