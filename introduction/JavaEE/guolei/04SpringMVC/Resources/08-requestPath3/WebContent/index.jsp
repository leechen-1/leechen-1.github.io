<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 会为不以斜杠开头的相对路径前自动添加上href属性所代表的路径，不过，该方式具有浏览器兼容问题，不建议使用 -->
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!-- 
		资源请求路径：http://localhost:8888/test/some.do
		资源定义路径：http://localhost:8888/08-requestPath3/test/some.do
	 -->
	<form action="/test/some.do" method="POST">
		<input type="submit" value="登录1"/>
	</form>
	
	<br>
	
	<!-- 
		资源请求路径：http://localhost:8888/08-requestPath3/test/some.do
		资源定义路径：http://localhost:8888/08-requestPath3/test/some.do
		 为什么出现两个test?
		  	当前请求路径的资源路径是  http://localhost:8888/08-requestPath3/test
			当前资源请求路径为：   http://localhost:8888/08-requestPath3/test/test/some.do
	 -->
	<form action="test/some.do" method="POST">
		<input type="submit" value="登录2"/>
	</form>

	
	<br>

	<form action="/08-requestPath3/test/some.do" method="POST">
		<input type="submit" value="登录3"/>
	</form>
	 
	<br>

	<form action="${pageContext.request.contextPath }/test/some.do" method="POST">
		<input type="submit" value="登录4"/>
	</form>
	 
	
	
</body>
</html>