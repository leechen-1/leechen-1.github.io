<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">

	// 定义两个student变量
	var student1 = {
			name:"张三",
			age:23
	};
	
	var student2 = {
			name:"李四",
			age:24
	};
	
	// 定义一个students数组
	var students = [];
	// 向数组中添加数组元素
	students.push(student1);
	students.push(student2);
	
	$(function() {
		$("button").click(function() {
			$.ajax({
				type:"POST",
				url:"some/myajax.do",
				contentType:"application/json",
				data:JSON.stringify(students),   // 将JSON数组转变为字符串
				success:function(data) {
					alert(data);
				}
			});
		});
	});
</script>
</head>
<body>
	<button>发出AJAX请求</button>
</body>
</html>