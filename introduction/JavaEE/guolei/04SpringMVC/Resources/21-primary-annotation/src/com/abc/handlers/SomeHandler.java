package com.abc.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
 *  @Component
 *  @Service ：Service
 *  @Repository : Dao
 *  @Controller : Handler
 * 
 */

// 定义处理器
@Controller
@RequestMapping("/test")  // 命名空间
public class SomeHandler {

	@RequestMapping({"/some.do","/first.do"})
	public ModelAndView doFirst(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello SpringMVC World!");
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	@RequestMapping("/second.do")
	public ModelAndView doSecond(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "执行doSecond()方法");
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	// @RequestMapping("/third*.do")   // 要求请求路径的资源名称以third开头
	// @RequestMapping("/*third.do")   // 要求请求路径的资源名称以third结尾
	// @RequestMapping("/*/third.do")   // 要求命名空间路径与请求路径的资源名称之间必须有一级路径
	@RequestMapping("/**/third.do")   // 要求命名空间路径与请求路径的资源名称之间可以有多级路径
	public ModelAndView doThird(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "执行doThird()方法");
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	@RequestMapping(value="/fourth.do", method=RequestMethod.POST)  
	public ModelAndView doFourth(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "执行doFourth()方法");
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
	// @RequestMapping(value="/fifth.do", params="name")  // 要求请求中必须携带name属性
	// @RequestMapping(value="/fifth.do", params={"name","age"})  // 要求请求中必须携带name与age属性
	// @RequestMapping(value="/fifth.do", params={"!name","age"})  // 要求请求中必须不能携带name属性，但必须携带age属性
	@RequestMapping(value="/fifth.do", params={"name=zs","age"})  // 要求请求中必须携带name与age属性，且name属性的值必须为zs
	public ModelAndView doFifth(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "执行doFifth()方法");
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
	}
	
}


























