package api.lang.string;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("닉네임을 입력하세요: ");
		String s = in.next();
		
		if(s.length()<2 || s.length()>10 || s.contains("운영자")) {
			System.out.println("잘못된 입력입니다.");
		}else {
			System.out.println("닉네임: " + s);
		}
	}
}
