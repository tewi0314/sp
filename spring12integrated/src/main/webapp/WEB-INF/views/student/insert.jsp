<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

	<h1>학생 정보 등록</h1>
	<form action="insert" method="post">
		이름 : <input type="text" name="name" required> <br><br>
		국어 : <input type="text" name="korean"  required> <br><br>
		영어 : <input type="text" name="english"  required> <br><br>
		수학 : <input type="text" name="math"  required> <br><br>
		<button>등록</button>
	</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>





