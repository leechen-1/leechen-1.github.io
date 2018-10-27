package com.abc.handlers;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

// 定义处理器
@Controller
@RequestMapping("/some")  
public class SomeHandler {

	@RequestMapping("/upload.do")
	public String doUpload(MultipartFile photo, HttpSession session) throws Exception {
		if (!photo.isEmpty()) {
			// String path = "E:/images";
			String path = session.getServletContext().getRealPath("/images");
			// 获取客户端上传文件的原始文件名
			String fileName = System.currentTimeMillis() + photo.getOriginalFilename();
			if (fileName.endsWith(".jpg") || fileName.endsWith(".png")) {
				File file = new File(path, fileName);
				photo.transferTo(file);
				return "/WEB-INF/jsp/welcome.jsp";
			}
		}
		return "/message.jsp";
	}
	
}

