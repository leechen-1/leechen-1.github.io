package com.abc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

// 定义处理器
@Controller
@RequestMapping("/some")  
public class SomeHandler {

	@RequestMapping("/first.do")
	public ModelAndView doFirst(String name, int age)  {
		System.out.println("----------");
		return new ModelAndView("forward:second.do");
	}
	
	@RequestMapping("/second.do")
	public ModelAndView doSecond()  {
		System.out.println("============");
		return new ModelAndView("forward:/WEB-INF/jsp/welcome.jsp");
	}
	
	@RequestMapping("/third.do")
	public ModelAndView doThird(String name, int age)  {
		ModelAndView mv = new ModelAndView();
		System.out.println("name = " + name);
		System.out.println("age = " + age);
		
		mv.addObject("pname", name);
		mv.addObject("page", age);
		
		mv.setViewName("redirect:fourth.do");
		// return new ModelAndView("redirect:/show.jsp");
		return mv;
	}
	
	@RequestMapping("/fourth.do")
	public ModelAndView doFourth()  {
		/*System.out.println("name = " + name);
		System.out.println("age = " + age);*/
		return new ModelAndView("/show.jsp");
	}
	
	@RequestMapping("/fifth.do")
	public String doFifth(String name, int age, Model model)  {
		model.addAttribute("pname", name);
		model.addAttribute("page", age);
		return "redirect:fourth.do";
	}
	
	@RequestMapping("/sixth.do")
	public String doSixth(String name, int age, RedirectAttributes ra)  {
		ra.addAttribute("pname", name);
		ra.addAttribute("page", age);
		return "redirect:fourth.do";
	}
	
}


























