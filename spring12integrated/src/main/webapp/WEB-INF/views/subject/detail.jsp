<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

	<h1>${subjectDto.name} 과목 정보</h1>
	과목번호 : ${subjectDto.no} <br><br>
	과정명 : ${subjectDto.name} <br><br>
	강의시수 : ${subjectDto.period} 시간<br><br>
	월 수강료 : ${subjectDto.price} 원 <br><br>
	강의유형 : ${subjectDto.type} <br><br>
	
	<h2><a href="list">목록으로</a></h2>
	<h2><a href="delete?no=${subjectDto.no}">지우기</a></h2>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>