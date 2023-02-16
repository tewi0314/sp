<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

	<!-- 제목 -->
	<c:choose>
		<c:when test="${column == null}">
			<h1>학생 목록</h1>
		</c:when>
		<c:otherwise>
			<h1>학생 검색</h1>
		</c:otherwise>
	</c:choose>
	
	<hr>
	
	<!-- 검색창 -->
	<form action="list" method="get">
		<input type="search" name="keyword" placeholder="검색할 학생명" value="${keyword}">
		<button>검색</button>
	</form>
	
	<hr>
	
	<!-- 테이블 -->
	<c:choose>
		<c:when test="${list.isEmpty()}">
			<h2>데이터가 존재하지 않습니다</h2>
		</c:when>
		<c:otherwise>
			<table border="1" width="400">
				<thead>
					<tr>
						<th>번호</th>
						<th>이름</th>
<!-- 						<th>국어</th> -->
<!-- 						<th>영어</th> -->
<!-- 						<th>수학</th> -->
						<th>총점</th>
<!-- 						<th>평균</th> -->
						<th>관리</th>
					</tr>
				</thead>
				<tbody align="center">
					<c:forEach var="studentDto" items="${list}">
					<tr>
						<td>${studentDto.no}</td>
						<td>
							<a href="detail?no=${studentDto.no}">
								${studentDto.name}
							</a>
						</td>
<%-- 						<td>${studentDto.korean}</td> --%>
<%-- 						<td>${studentDto.english}</td> --%>
<%-- 						<td>${studentDto.math}</td> --%>
						<td>${studentDto.total}</td>
<%-- 						<td>${studentDto.average}</td> --%>
						<td>
							<a href="#">수정</a>
							<a href="delete?no=${studentDto.no}&keyword=${keyword}">삭제</a>
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:otherwise>
	</c:choose>
	
	<!-- 등록 링크 -->
	<h2><a href="insert">신규 학생 등록</a></h2>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>






