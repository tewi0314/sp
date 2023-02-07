<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>과정 정보 입력</h1>
	<form action="insertProcess" method="post">
		번호<input name="no"><br><br>
		이름<input name="name"><br><br>
		기간<input name="period"><br><br>
		가격<input name="price"><br><br>
		타입<input name="type"><br><br>
		<button>입력</button>
	</form>
</body>
</html>