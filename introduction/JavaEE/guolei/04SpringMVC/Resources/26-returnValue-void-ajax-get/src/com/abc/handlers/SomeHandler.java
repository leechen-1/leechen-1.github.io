package com.abc.handlers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abc.beans.Student;

import net.sf.json.JSONObject;

// 定义处理器
@Controller
@RequestMapping("/some")  
public class SomeHandler {

	@RequestMapping("/myajax.do")
	public void doAjax(Student student, HttpServletResponse response) throws Exception {
		// 将自定义对象封装到map中
		Map<String, Object> map = new HashMap<>();
		map.put("pname", student.getName());
		map.put("page", student.getAge());
		
		// 将map转换为json对象
		JSONObject myJson = JSONObject.fromObject(map);
		String json = myJson.toString();
		
		// 给出客户端响应
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().print(json);
		
	}
	
	
}


























