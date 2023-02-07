<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!-- 
		ul:순서없는 리스트 태그(unorder list)
		ol:순서있는 리스트 태그(order list)
		-select와 같은 구조로 배치하는 태그
		-내부에 li(list item)태그를 사용하여 항목을 표시 
	 -->
	 
	 <ul>
	 	<li>번호: ${studentDto.no}</li>
	 	<li>이름: ${studentDto.name}</li>
	 	<li>국어: ${studentDto.korean}</li>
	 	<li>영어: ${studentDto.english}</li>
	 	<li>수학: ${studentDto.math}</li>
	 	<li>총점: ${studentDto.total}</li>
	 	<li>평균: ${studentDto.avg}</li>
	 </ul>
	 
</body>
</html>