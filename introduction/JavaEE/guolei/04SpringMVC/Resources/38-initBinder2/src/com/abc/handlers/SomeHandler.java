package com.abc.handlers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.abc.editors.CustomMultiDateEditor;

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
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomMultiDateEditor());
	}
	
}


























