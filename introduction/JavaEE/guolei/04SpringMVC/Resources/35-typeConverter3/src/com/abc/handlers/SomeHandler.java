package com.abc.handlers;

import java.text.ParseException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// 定义处理器
@Controller
@RequestMapping("/some")  
public class SomeHandler {

	@RequestMapping("/register.do")
	public ModelAndView doRegister(int age, Date birthday) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("age", age);
		mv.addObject("birthday", birthday);
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	@ExceptionHandler(TypeMismatchException.class)
	public ModelAndView handleException(HttpServletRequest request, Exception ex) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("ageValue", request.getParameter("age"));
		mv.addObject("birthdayValue", request.getParameter("birthday"));
		mv.addObject("ex", ex.getMessage());
		mv.setViewName("/index.jsp");
		return mv;
	}
	
}


























