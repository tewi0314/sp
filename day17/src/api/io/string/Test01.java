package api.io.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//문자열과 바이트간 변환
		
		String str = "hello 안녕하세요";
		
		byte[] b1 = str.getBytes(/* UTF-8 */);
		System.out.println("b1 = " + Arrays.toString(b1));
		
		byte[] b2 = str.getBytes("MS949");
		System.out.println("b2 =  " +Arrays.toString(b2));
		
		//- 바이트 배열을 문자열로 만들려면 String 클래스의 생성자를 사용
		/* String s1 = new String(b1); */
		String s1 = new String(b2, "MS949");
		System.out.println("s1 = " + s1);
	}
}
