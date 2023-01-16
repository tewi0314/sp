package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
		//Date
		//-현재 시각을 원하는 방식으로 출력하는데 주로 사용
		//[1] 기본 언어를 바꿔서 출력
		//
		
		Date a = new Date();
		System.out.println("a: " + a);
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(f.format(a));
	}
}
