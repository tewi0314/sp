<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

	<!-- 제목 -->
	<h1>과목 ${mode}</h1>
	
	<!-- 검색창 -->
	<form action="list" method="get">
		<select name="column">
			<option value="name">과정명</option>
			<option value="period">강의시간</option>
			<option value="type">강의유형</option>
		</select>
		<input type="search" name="keyword" placeholder="검색어" value="${keyword}">
		<button>검색</button>
	</form>
	
	<hr>
	
	<c:choose>
		<c:when test="${list.isEmpty()}">
			<h2>데이터가 존재하지 않습니다</h2>
			<a href="insert">등록하기</a>
		</c:when>
		<c:otherwise>
			<!-- 테이블 -->
			<table border="1" width="500">
				<thead>
					<tr>
						<th>번호</th>
						<th width="40%">과정명</th>
						<th>강의시간</th>
						<th>수강료</th> 
						<th>수업방식</th>
					</tr>
				</thead>
				<tbody align="center">
					<c:forEach var="subjectDto" items="${list}">
					<tr>
						<td>${subjectDto.no}</td>
						<td align="left">
							<a href="detail?no=${subjectDto.no}">
								${subjectDto.name}
							</a>
						</td>
						<td>${subjectDto.period}</td>
						<td align="right">${subjectDto.price}</td>
						<td>${subjectDto.type}</td>
					</tr>
					</c:forEach>
				</tbody>
				<tfoot>
					<tr>
						<!-- 5칸 만큼 차지하세요 -->
						<td colspan="5" align="right">
							<a href="insert">등록하기</a>
						</td>					
					</tr>
				</tfoot>
			</table>
		</c:otherwise>
	</c:choose>
	
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
	





