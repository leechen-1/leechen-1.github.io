<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	welcome page <br>
	${message } <br>
	${requestScope.message } <br>
	
	<hr>
	
	<!-- 底层执行了request.getAttribute("name") -->
	${requestScope.name } <br>
	${requestScope.age } <br>
	${requestScope.student } <br>
	
	<hr>
	
	<!-- 底层执行了request.getParameter("name") -->
	${param.name } <br>
	${param.age } <br>
</body>
</html>