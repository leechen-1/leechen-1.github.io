package com.abc.handlers;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.abc.exceptions.AgeException;
import com.abc.exceptions.UsernameException;

public class CustomExceptionHandler {

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


























