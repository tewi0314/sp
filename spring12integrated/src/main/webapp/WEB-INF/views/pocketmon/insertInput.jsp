<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

	<h1>포켓몬 등록</h1>
	<!-- 
		form 전송방식은 크게 두 가지로 나뉜다
		- GET : 기본 방식. 주소를 통해 데이터를 전달하는 방식
			- 마치 편지봉투에 할 말을 작성하는 것과 유사하다
			- 간편하게 사용할 수 있다는 장점이 있다
			- 용량 제한이 있다(주소 포함 256byte)
			- 모든 데이터가 노출된다
			- a, img, form, 주소를 직접 입력하는 등 다양한 형태로 가능하다
		- POST : 주소가 아니라 요청 내부에 숨겨서 데이터를 전달하는 방식(body)
			- 마치 편지지에 할 말을 작성하는 것과 유사하다
			- 용량 제한이 없으며 데이터가 요청 바디(편지지)에 숨겨져서 전송
			- form으로만 가능하다
	-->
	
<!-- 	<form action="/pocketmon/insertProcess"> -->
	<form action="insertProcess" method="post">
		번호 : <input name="no"> <br><br>
		이름 : <input name="name"> <br><br>
		속성 : <input name="type"> <br><br>
		<button>등록</button>
	</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>


