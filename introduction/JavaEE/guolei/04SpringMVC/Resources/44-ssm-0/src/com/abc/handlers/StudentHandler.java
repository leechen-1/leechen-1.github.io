package com.abc.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.abc.beans.Student;
import com.abc.service.IStudentService;

public class StudentHandler implements Controller {
	private IStudentService service;
	
	public void setService(IStudentService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 接收请求参数
		String name = request.getParameter("name");
		String ageStr = request.getParameter("age");
		
		// 将请求能数进行相应类型转换
		Integer age = Integer.valueOf(ageStr);
		
		// 将请求参数封装为Student
		Student student = new Student(name, age);
		
		// 调用Service的saveStudent()将对象写入DB
		service.saveStudent(student);
		
		// 页面跳转
		return new ModelAndView("/welcome.jsp");
	}

}
