package exception;

public class Calculator {
	//위험한 메소드- 예외가 발생할 수도 있는 메소드
	//-메소드 헤더 우측에 throws Exception라고 적으면
	// Exception이 발생할 수 있는 메소드임을 표시
	
	public static int div(int left, int right) throws Exception{
		return left/right;
		
	}
}
