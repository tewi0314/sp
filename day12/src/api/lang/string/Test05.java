package api.lang.string;

public class Test05 {
	public static void main(String[] args) {
		//문자열 편집
		//-문자열은 불면(immutable) 속성을 가진다
		//-한 번 만들어진 문자열은 바뀌지 않으며, 바꾸고 싶다면 새로 만들어야 한다
		
		String url = "www.naver.com";
		System.out.println(url.toUpperCase());
		System.out.println(url);
		
		String url2 = "   www.naver.com  ";
		url2 = url2.trim();
		System.out.println(url2);
		
		String url3 = "www.google.com";
		System.out.println(url3.substring(4,10));
		System.out.println(url3.charAt(4));
		
		String text ="나는 피자가 좋아요";
		System.out.println(text.replace("피자", "자바"));
	}
}
