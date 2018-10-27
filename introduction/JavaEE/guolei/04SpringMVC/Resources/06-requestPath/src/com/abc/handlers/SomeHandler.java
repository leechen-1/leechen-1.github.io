package com.abc.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// 定义处理器
public class SomeHandler implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello SpringMVC World!");
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}

}
