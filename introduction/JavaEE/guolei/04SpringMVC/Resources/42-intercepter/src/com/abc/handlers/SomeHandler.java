package com.abc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 定义处理器
@Controller
@RequestMapping("/some")  
public class SomeHandler {

	@RequestMapping("/first.do")
	public String doFirst() {
		System.out.println("执行处理器方法");
		return "/welcome.jsp";
	}
	
}

