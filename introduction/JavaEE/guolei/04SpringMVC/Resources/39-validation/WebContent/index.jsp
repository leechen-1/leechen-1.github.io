<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/some/register.do" method="POST">
		姓名：<input type="text" name="name" value="${name }"/> ${nameErrorMsg }<br>
		成绩：<input type="text" name="score" value="${score }"/> ${scoreErrorMsg }<br>
		手机：<input type="text" name="mobile" value="${mobile }"/> ${mobileErrorMsg }<br>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>