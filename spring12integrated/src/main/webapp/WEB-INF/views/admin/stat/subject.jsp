<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>과정 현황</h1>

<table border="1" width="500">
	<thead>
		<tr>
			<th>유형</th>
			<th>평균</th>
			<th>과정수</th>
		</tr>
	</thead>
	<tbody align="center">
		<c:forEach var="subjectStatDto" items="${list}">
		<tr>
			<td>${subjectStatDto.type}</td>
			<td align="right">
				<fmt:formatNumber value="${subjectStatDto.average}" 
								pattern="#,##0.00"></fmt:formatNumber>
			</td>
			<td>${subjectStatDto.cnt}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>