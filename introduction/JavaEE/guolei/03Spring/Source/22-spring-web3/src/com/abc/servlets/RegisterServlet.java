package com.abc.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.abc.beans.Student;
import com.abc.service.IStudentService;

public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 1. 获取请求参数
		String name = request.getParameter("name");
		String ageStr = request.getParameter("age");
		Integer age = Integer.valueOf(ageStr);
		
		// 2. 将请求参数封装为Student对象
		Student student = new Student(name, age);
		
		// 3. 获取Spring容器对象
		WebApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		System.out.println("ac = " + ac);
		
		// 4. 从容器中获取Service对象
		IStudentService service = (IStudentService) ac.getBean("studentService");
		
		// 5. 调用Service的saveStudent()方法将对象写入到DB
		service.saveStudent(student);
		
		// 6. 页面跳转
		// request.getRequestDispatcher("/welcome.jsp").forward(request, response);
		response.sendRedirect(request.getContextPath() + "/welcome.jsp");
		
	}
}
