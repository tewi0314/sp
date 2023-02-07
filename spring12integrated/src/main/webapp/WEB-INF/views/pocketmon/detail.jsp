<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${pocketmonDto.no}번 몬스터 정보</title>
</head>
<body>
	
	<h1>포켓몬 정보</h1>
	번호: ${pocketmonDto.no}<br>
	이름: ${pocketmonDto.name}<br>
	속성: ${pocketmonDto.type}<br>
</body>
</html>