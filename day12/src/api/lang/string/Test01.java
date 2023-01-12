package api.lang.string;

public class Test01 {
	public static void main(String[] args) {
		//java.lang.String 클래스
		//객체생성
		String a = "hello";
		String b = new String("hello");
		
		char[] ch = new char[] {'h', 'e', 'l', 'l', 'o'};
		String c = new String(ch);
		
		//메소드 사용
		
		//글자수
		System.out.println(a.length());
		System.out.println(b.length());
		
		//비교
		System.out.println(a==b); //동일비교(의미없음)
		System.out.println(a.equals(b)); //동등비교(글자가 같은지)
		
		//비교는 대소문자를 구분한다
		String d = "Hello";
		System.out.println(a.equals(d));
		System.out.println(a.equalsIgnoreCase(d));
		
		//문자열은 전체가 아닌 일부만 비교하는 경우도 있다
		String e = 	"https://iei.or.kr";
		
		System.out.println(e.startsWith("http"));
		System.out.println(e.endsWith(".or.kr"));
		System.out.println(e.contains("naver"));
		System.out.println(e.indexOf("naver"));
		System.out.println(e.indexOf(":"));
	}
}
