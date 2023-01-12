package api.lang.object;
//import java.lang.Object;
public class Test01 {
	public static void main(String[] args) {
		//java.lang.Object 클래스 분석
		
		//[1]객체 생성
		Object a = new Object();
		Object b = new Object();
		
		//[2]객체 사용
		//a.clone();
		//a.finalize();
		
		//(1) 객체는 일련번호로 관리된다.
		//(2) 객체는 요약정보 확인 명령어 존재한다.
		System.out.println(a.toString());
		System.out.println(a);
		System.out.println(a.getClass());
		System.out.println(a.hashCode());
		System.out.println();
		System.out.println(b.hashCode());
		System.out.println(b.toString());
	}
}
