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
		href="/some.do"，这是一个前台路径，前台路径的参照路径是当前Web服务器的根 http://localhost:8888
		根据 绝对路径 = 参照路径 + 相对路径 转换关系，转换为的资源请求路径为：
		资源请求路径： http://localhost:8888/some.do
		
		资源定义路径： http://localhost:8888/01-primary/some.do
	 -->
	<a href="/some.do">111跳转到SomeHandler</a> <br>
	
	<!-- 
		href="some.do"，这是一个不以斜杠开头的相对路径，其参照路径为当前请求路径的资源路径 http://localhost:8888/01-primary
		根据 绝对路径 = 参照路径 + 相对路径 转换关系，转换为的资源请求路径为：
		资源请求路径： http://localhost:8888/01-primary/some.do
		
		资源定义路径： http://localhost:8888/01-primary/some.do
	 -->
	<a href="some.do">222跳转到SomeHandler</a> <br>
	
	<a href="${pageContext.request.contextPath }/some.do">333跳转到SomeHandler</a> <br>
	
	
</body>
</html>