<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

	<h1>학생 상세 정보</h1>
	
	<!-- 
		ul : 순서 없는 리스트 태그(unorder list)
		ol : 순서 있는 리스트 태그(order list)
		- select 와 같은 구조로 배치하는 태그
		- 내부에 li(list item) 태그를 사용하여 항목을 표시 
	-->	
	<ul>
		<li>번호 : ${studentDto.no}</li>
		<li>이름 : ${studentDto.name}</li>
		<li>국어 : ${studentDto.korean}점</li>
		<li>영어 : ${studentDto.english}점</li>
		<li>수학 : ${studentDto.math}점</li>
		<li>총점 : ${studentDto.total}점</li>
		<li>평균 : ${studentDto.average}점</li>
	</ul>
	
	<h2><a href="list">목록보기</a></h2>
	<h2><a href="delete?no=${studentDto.no}">지우기</a></h2>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>



