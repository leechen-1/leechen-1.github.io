package com.abc.handlers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abc.beans.Student;

// 定义处理器
@Controller
@RequestMapping("/some")  
public class SomeHandler {

	@RequestMapping("/myajax.do")
	// @RequestBody 表示当前参数值来自于请求体
	public void doAjax(@RequestBody List<Student> students, HttpServletResponse response) throws Exception {
		System.out.println("students = " + students);
		
		response.setContentType("text/html");
		response.getWriter().print("receive success");
	}
	
	
}


























