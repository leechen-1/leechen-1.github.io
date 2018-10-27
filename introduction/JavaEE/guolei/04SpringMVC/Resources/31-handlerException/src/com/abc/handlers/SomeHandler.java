package com.abc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.abc.exceptions.AgeException;
import com.abc.exceptions.UsernameException;

// 定义处理器
@Controller
@RequestMapping("/some")  
public class SomeHandler {

	@RequestMapping("/second.do")
	public String doSecond(String name, int age) throws Exception  {
		
		if(!"aynu".equals(name)) {
			throw new UsernameException("用户名有误");
		}
		
		if(age <= 0 || age > 200) {
			throw new AgeException("年龄有误");
		}
		
		int i = 3 / 0;
		
		return "/WEB-INF/jsp/welcome.jsp";
	}
	
	@ExceptionHandler
	public ModelAndView handleException(Exception ex) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("ex", ex.getMessage());
		mv.setViewName("/errors.jsp");
		return mv;
	}
	
	@ExceptionHandler(UsernameException.class)
	public ModelAndView handleUsernameException(Exception ex) {
		// ...
		ModelAndView mv = new ModelAndView();
		mv.addObject("ex", ex.getMessage());
		mv.setViewName("/nameErrors.jsp");
		return mv;
	}
	
	@ExceptionHandler(AgeException.class)
	public ModelAndView handleAgeException(Exception ex) {
		// ...
		ModelAndView mv = new ModelAndView();
		mv.addObject("ex", ex.getMessage());
		mv.setViewName("/ageErrors.jsp");
		return mv;
	}
	
}


























