package com.abc.di12;

public class Teacher {
	private String name;
	private int teachAge;
	private String school;
	private String department;

	public void setName(String name) {
		this.name = name;
	}

	public void setTeachAge(int teachAge) {
		this.teachAge = teachAge;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", teachAge=" + teachAge + ", school=" + school + ", department=" + department
				+ "]";
	}

}
