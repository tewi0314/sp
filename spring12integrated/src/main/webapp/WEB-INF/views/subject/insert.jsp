<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

	<h1>과목 정보 등록</h1>
	<form action="insert" method="post">
		과정명 : <input type="text" name="name" required> <br><br> 
		시수 : <input type="text" name="no" required> <br><br>
		판매가 : <input type="text" name="price" required> <br><br>
		유형 : <input type="text" name="type" required> <br><br>
		<button>등록</button>
	</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>



