package com.abc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 定义处理器
@Controller
@RequestMapping("/some")  
public class SomeHandler {

	@RequestMapping("/system.do")
	public String doSystem() {
		return "/welcome.jsp";
	}
	
}

