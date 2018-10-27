package com.abc.handlers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.abc.beans.Student;

// 定义处理器
@Controller
@RequestMapping("/some")  
public class SomeHandler {

	@RequestMapping("/first.do")
	public ModelAndView doFirst(Map<String, Object> map) {
		// 下面的语句相当于request.setAttribute("message", "处理器方法的参数为Map")
		map.put("message", "处理器方法的参数为Map");
		return new ModelAndView("/WEB-INF/jsp/welcome.jsp");
	}
	
	// 处理器方法参数名称必须要与请求参数名称相同，才可接收到相应的值
	@RequestMapping("/second.do")
	public ModelAndView doSecond(String name, int age, Map<String, Object> map) {
		map.put("name", name);
		map.put("age", age);
		return new ModelAndView("/WEB-INF/jsp/welcome.jsp");
	}
	
	// @RequestParam用于校正参数
	@RequestMapping("/third.do")
	public ModelAndView doThird(@RequestParam("name") String pname, @RequestParam("age") int page, Map<String, Object> map) {
		map.put("name", pname);
		map.put("age", page);
		return new ModelAndView("/WEB-INF/jsp/welcome.jsp");
	}
	
	// @RequestParam用于校正参数
	// 可以使用Map进行请求参数的整体接收，但接收的值都是String类型，不会进行类型的自动转换
	@RequestMapping("/fourth.do")
	public ModelAndView doFourth(@RequestParam Map<String, Object> map, HttpServletRequest request) {
		String name = (String) map.get("name");
		String age = (String) map.get("age");
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		return new ModelAndView("/WEB-INF/jsp/welcome.jsp");
	}
	
	// 使用自定义类型对象对请求参数进行整体接收，系统会将对象自动放入到请求域
	// 需要注意的是，若使用请求参数的逐个接收方式，系统不会将请求参数自动放放到请求域
	@RequestMapping("/fifth.do")
	public ModelAndView doFifth(Student student) {
		System.out.println(student);
		return new ModelAndView("/WEB-INF/jsp/welcome.jsp");
	}
	
	@RequestMapping("/sixth.do")
	public ModelAndView doSixth(String name, int age) {
		
		return new ModelAndView("/WEB-INF/jsp/welcome.jsp");
	}
	
	// RESTFUL风格
	@RequestMapping("/{pname}/{age}/seventh.do")
	public ModelAndView doSeventh(@PathVariable("pname") String name, @PathVariable int age, Map<String, Object> map) {
		map.put("name", name);
		map.put("age", age);
		return new ModelAndView("/WEB-INF/jsp/welcome.jsp");
	}
	
}


























