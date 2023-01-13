package api.lang.etc;

public class Test02 {
	public static void main(String[] args) {
		//System 클래스
		//-생성자 없음(아예 생성이 불가/미리 생성해두었거나 대행해주는 케이스)
		//- Math 클래스와 같은 이유로 생성자가 없다(어디서나 편하게)
		//- 프로그램 외부환경(OS)에 대한 정보 및 기능을 제공
		
		System.out.println("hello"); //표준출력
		System.err.println("hello"); //표준 오류 출력
		
		System.out.println(System.getProperty("java.specification.version"));
		System.out.println(System.getProperty("user.country"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("os.name"));
		
		System.exit(0);//프로그램 종료(전달하는 숫자는 외부 환경으로 전달된다.) - 0이면 정상종료, 아니면 비상종료
		System.out.println("이 메세지는 나올까?");
	}
}
