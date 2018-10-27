package com.abc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abc.exceptions.AgeException;
import com.abc.exceptions.UsernameException;

// 定义处理器
@Controller
@RequestMapping("/some")  
public class SomeHandler {

	@RequestMapping("/first.do")
	public String doFirst()  {
		int i = 3 / 0;
		return "/WEB-INF/jsp/welcome.jsp";
	}
	
	@RequestMapping("/second.do")
	public String doSecond(String name, int age) throws Exception  {
		
		if(!"aynu".equals(name)) {
			throw new UsernameException("用户名有误");
		}
		
		if(age <= 0 || age > 200) {
			throw new AgeException("年龄有误");
		}
		
		// int i = 3 / 0;
		
		return "/WEB-INF/jsp/welcome.jsp";
	}
	
}


























