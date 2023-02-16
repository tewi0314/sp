<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>회원 현황</h1>

<!-- 각종 정렬과 관련된 링크 -->
<a href="member">등급순</a>
<a href="member?sort=cnt desc">인원많은순</a>
<a href="member?sort=cnt asc">인원적은순</a>
<a href="member?sort=total desc">포인트합계↓</a>

<br>

<table border="1" width="600">
	<thead>
		<tr>
			<th>등급</th>
			<th>인원수</th>
			<th>포인트합계</th>
			<th>포인트평균</th>
			<th>최대포인트</th>
			<th>최소포인트</th>
		</tr>
	</thead>
	<tbody align="right">
		<c:forEach var="memberStatDto" items="${list}">
		<tr>
			<td align="center">${memberStatDto.memberLevel}</td>
			<td>
				<fmt:formatNumber value="${memberStatDto.cnt}" pattern="#,##0"></fmt:formatNumber>
			</td>
			<td>
				<fmt:formatNumber value="${memberStatDto.total}" pattern="#,##0"></fmt:formatNumber>
			</td>
			<td>
				<fmt:formatNumber value="${memberStatDto.average}" pattern="#,##0.00"></fmt:formatNumber>
			</td>
			<td>
				<fmt:formatNumber value="${memberStatDto.max}" pattern="#,##0"></fmt:formatNumber>
			</td>
			<td>
				<fmt:formatNumber value="${memberStatDto.min}" pattern="#,##0"></fmt:formatNumber>
			</td>
		</tr>
		</c:forEach>
	</tbody>
</table>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>