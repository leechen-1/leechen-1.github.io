package com.abc.exceptions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class CustomExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("ex", ex.getMessage());
		mv.setViewName("/errors.jsp");
		
		if(ex instanceof UsernameException) {
			// ...
			mv.setViewName("/nameErrors.jsp");
		}
		
		if(ex instanceof AgeException) {
			// ...
			mv.setViewName("/ageErrors.jsp");
		}
		
		return mv;
	}

}
