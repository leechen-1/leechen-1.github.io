<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		分析出资源定义路径：
		http://localhost:8888/07-requestPath2/images/car1.jpg
	 -->
	
	<!-- 
		src="/images/car1.jpg"，这是一个前台路径，其参照路径是当前Web服务器的根 http://localhost:8888
		根据 绝对路径 = 参照路径 + 相对路径 转换关系，客户端提交的资源请求路径为：
		http://localhost:8888/images/car1.jpg
		资源请求路径与资源定义路径不相同，所以无法显示图片。
	 -->
	<img alt="car" src="/images/car1.jpg">图片111 <br>
	
	<!-- 
		src="images/car1.jpg"，这是一个不以斜杠开头的相对路径，其参照路径是当前请求路径的资源路径 http://localhost:8888/07-requestPath2
		根据 绝对路径 = 参照路径 + 相对路径 转换关系，客户端提交的资源请求路径为：
		http://localhost:8888/07-requestPath2/images/car1.jpg
		资源请求路径与资源定义路径相同，所以可以显示图片。
	 -->
	<img alt="car2" src="images/car1.jpg">图片222 <br>
	
	<img alt="car3" src="${pageContext.request.contextPath }/images/car1.jpg">图片333 <br>
	
</body>
</html>














