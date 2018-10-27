package com.abc.handlers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abc.beans.Student;
import com.abc.service.IStudentService;

@Controller
@RequestMapping("/some")
public class StudentHandler {
	
	@Resource(name="studentService")
	private IStudentService service;
	
	public void setService(IStudentService service) {
		this.service = service;
	}

	@RequestMapping("/register.do")
	public String doRegister(Student student) {
		service.saveStudent(student);
		return "/welcome.jsp";
	}

}
