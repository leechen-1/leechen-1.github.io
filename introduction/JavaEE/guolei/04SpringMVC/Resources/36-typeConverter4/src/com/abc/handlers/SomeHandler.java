package com.abc.handlers;

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
		
		// 获取用户输入数据
		String ageValue = request.getParameter("age");
		String birthdayValue = request.getParameter("birthday");
		
		// 获取异常信息
		String error = ex.getMessage();
		
		if(error.contains(ageValue)) {
			mv.addObject("ageError", "年龄输入有误");
		}
		
		if(error.contains(birthdayValue)) {
			mv.addObject("birthdayError", "生日输入有误");
		}
		
		mv.addObject("ageValue", ageValue);
		mv.addObject("birthdayValue", birthdayValue);
		mv.setViewName("/index.jsp");
		return mv;
	}
	
}


























