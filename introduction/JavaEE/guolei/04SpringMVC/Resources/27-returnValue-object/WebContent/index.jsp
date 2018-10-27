<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">

	$(function() {
		$("button").click(function() {
			$.ajax({
				url:"some/fifth.do",
				success:function(data) {
					$(data).each(function(index) {
						alert(data[index].name + " : " + data[index].age);
					});
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