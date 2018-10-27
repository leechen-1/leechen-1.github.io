package com.abc.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

// 定义处理器
public class SomeHandler extends MultiActionController {

	// 处理器方法
	public ModelAndView doFirst(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("method", "执行doFirst()方法");
		mv.setViewName("/welcome.jsp");
		return mv;
	}
	// 处理器方法
	public ModelAndView doSecond(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("method", "执行doSecond()方法");
		mv.setViewName("/welcome.jsp");
		return mv;
	}

}
