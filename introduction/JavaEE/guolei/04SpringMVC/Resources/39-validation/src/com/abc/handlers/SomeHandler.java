package com.abc.handlers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.abc.beans.Student;

// 定义处理器
@Controller
@RequestMapping("/some")  
public class SomeHandler {

	@RequestMapping("/register.do")
	public ModelAndView doRegister(@Validated Student student, BindingResult rs) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		
		/*
		int errorCount = rs.getErrorCount();
		List<ObjectError> allErrors = rs.getAllErrors();
		int size = allErrors.size();
		*/
		
		if(rs.hasErrors()) {
			FieldError nameError = rs.getFieldError("name");
			FieldError scoreError = rs.getFieldError("score");
			FieldError mobileError = rs.getFieldError("mobile");
			
			
			List<FieldError> me = rs.getFieldErrors("mobile");
			for (FieldError fieldError : me) {
				System.out.println(fieldError.getDefaultMessage());
			}
			
			
			
			if (nameError != null) {
				String nameErrorMsg = nameError.getDefaultMessage();
				mv.addObject("nameErrorMsg", nameErrorMsg);
			}
			if (scoreError != null) {
				String scoreErrorMsg = scoreError.getDefaultMessage();
				mv.addObject("scoreErrorMsg", scoreErrorMsg);
			}
			if (mobileError != null) {
				String mobileErrorMsg = mobileError.getDefaultMessage();
				mv.addObject("mobileErrorMsg", mobileErrorMsg);
			}
			
			mv.addObject("name", student.getName());
			mv.addObject("score", student.getScore());
			mv.addObject("mobile", student.getMobile());
			mv.setViewName("/index.jsp");
		}
		
		return mv;
	}
	
	
}

