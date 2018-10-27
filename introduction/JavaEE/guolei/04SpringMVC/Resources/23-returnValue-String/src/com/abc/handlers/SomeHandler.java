package com.abc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 定义处理器
@Controller
@RequestMapping("/some")  
public class SomeHandler {

	@RequestMapping("/first.do")
	public String doFirst() {
		// 返回物理视图名称
		return "/WEB-INF/jsp/welcome.jsp";
	}
	
	@RequestMapping("/second.do")
	public String doSecond() {
		// 返回逻辑视图名称
		return "welcome";
	}
	
	@RequestMapping("/third.do")
	public String doThird() {
		// 返回逻辑视图名称(BeanName)
		return "baidu";
	}
	
}


























