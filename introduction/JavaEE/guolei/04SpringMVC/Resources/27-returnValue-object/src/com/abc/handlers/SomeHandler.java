package com.abc.handlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.abc.beans.Student;

// 定义处理器
@Controller
@RequestMapping("/some")  
public class SomeHandler {

	@RequestMapping("/first.do")
	@ResponseBody
	// public Object doFirst() {
	public Double doFirst() {
		return 123.456;
	}
	
	// 一旦使用了produces="text/html;charset=UTF-8"，那么，系统将不使用HttpMessageConverter适配器
	@RequestMapping(value="/second.do", produces="text/html;charset=UTF-8")
	@ResponseBody
	// public Object doSecond() {
	public String doSecond() {
		return "aynu安阳师范学院";
	}
	
	@RequestMapping("/third.do")
	@ResponseBody
	// public Object doThird() {
	public Student doThird() {
		return new Student("张三", 23);
	}
	
	@RequestMapping("/fourth.do")
	@ResponseBody
	// public Object doFourth() {
	public Map<String, Object> doFourth() {
		Student student1 = new Student("张三", 23);
		Student student2 = new Student("李四", 24);
		Student student3 = new Student("王五", 25);
		
		Map<String, Object> students = new HashMap<>();
		students.put("stu1", student1);
		students.put("stu2", student2);
		students.put("stu3", student3);
		return students;
	}
	
	@RequestMapping("/fifth.do")
	@ResponseBody
	// public Object doFifth() {
	public List<Student> doFifth() {
		Student student1 = new Student("张三", 23);
		Student student2 = new Student("李四", 24);
		Student student3 = new Student("王五", 25);
		
		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		return students;
	}
	
	
}


























