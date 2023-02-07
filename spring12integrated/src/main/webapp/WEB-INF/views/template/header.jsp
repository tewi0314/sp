<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내가만든 홈페이지</title>
</head>
<body>
	<!-- 
		홈페이지를 상단(header), 컨텐츠(main), 하단(footer)으로 
		구분하여 생성 후 불러오기 
		- 상단과 하단은 별도의 페이지로 만든 뒤 불러오도록 처리
		- 이러한 페이지들을 템플릿 페이지(template page)라고 부름
		- (주의) 템플릿 페이지는 어디서 실행될 지 모르므로 상대경로 사용 금지
	-->
	
	<!-- 상단 -->
	
	<%--
		메뉴는 로그인 여부에 따라 다르게 출력
		- 로그인 여부는 세션에 memberId가 있는지 여부로 판정
	 --%>
	<c:choose>
		<c:when test="${memberId != null}">
		<!-- 로그인 상태 -->
		<a href="/">홈으로</a>
		<a href="/member/logout">로그아웃</a>
		<a href="/member/mypage">마이페이지</a>
		</c:when>
		<c:otherwise>
		<!-- 로그아웃 상태 -->
		<a href="/">홈으로</a>
		<a href="/member/join">회원가입</a>
		<a href="/member/login">로그인</a>
		</c:otherwise>
	</c:choose>
	
	
	<a href="/pocketmon/list">포켓몬관리</a>
	<a href="/subject/list">과목관리</a>
	<a href="/student/list">학생관리</a>
	<hr>
	
	
	