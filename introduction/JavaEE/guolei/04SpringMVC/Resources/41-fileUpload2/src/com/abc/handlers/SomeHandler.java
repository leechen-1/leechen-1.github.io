package com.abc.handlers;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

// 定义处理器
@Controller
@RequestMapping("/some")  
public class SomeHandler {

	@RequestMapping("/upload.do")
	// SpringMVC使用低版本时，需要使用@RequestParam对数组参数进行校正
	// public String doUpload(@RequestParam MultipartFile[] photos, HttpSession session) throws Exception {  
	public String doUpload(MultipartFile[] photos, HttpSession session) throws Exception {
		boolean flag = false;
		for (int i = 0; i < photos.length; i++) {
			if (!photos[i].isEmpty()) {
				// String path = "E:/images";
				String path = session.getServletContext().getRealPath("/images");
				// 获取客户端上传文件的原始文件名
				String fileName = System.currentTimeMillis() + photos[i].getOriginalFilename();
				if (fileName.endsWith(".jpg") || fileName.endsWith(".png")) {
					File file = new File(path, fileName);
					photos[i].transferTo(file);
					flag = true;
				}
			} 
		}
		if(flag) {
			return "/WEB-INF/jsp/welcome.jsp";
		}
		return "/message.jsp";
	}
	
}

