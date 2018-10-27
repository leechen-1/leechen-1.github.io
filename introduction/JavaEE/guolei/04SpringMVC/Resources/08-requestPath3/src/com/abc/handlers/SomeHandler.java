package com.abc.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// 定义处理器
public class SomeHandler implements Controller {

	
	// index页面的资源定义路径为：http://localhost:8888/08-requestPath3/index.jsp
	// index页面的资源请求路径为：http://localhost:8888/08-requestPath3/index.jsp
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("==============");
		return new ModelAndView("/index.jsp");
	}
	
	//  http://localhost:8888/08-requestPath3/test/index.jsp

}
