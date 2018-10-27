<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/some/fifth.do" method="POST">
		姓名：<input type="text" name="name"/> <br>
		年龄：<input type="text" name="age"/> <br>
		学校：<input type="text" name="school.sname"/> <br>
		校址：<input type="text" name="school.address"/> <br>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>