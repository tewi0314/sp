package api.lang.etc;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		//Math 클래스
		//- 생성자 없음(아예 생성이 불가/미리 생성해두거나 대행해주는 경우)
		
		//Math a = new Math();
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.round(1.5)); //반올림
		System.out.println(Math.floor(1.5)); //버림
		System.out.println(Math.ceil(1.5)); // 올림
		
		System.out.println(Math.abs(50-20));
		System.out.println(Math.abs(20-50));
		
		Random r = new Random();
		int a = r.nextInt(6) + 1;
		int b = r.nextInt(6) + 1;
		
		System.out.println(Math.max(a, b)+ " " + Math.min(a, b));
	}
}
