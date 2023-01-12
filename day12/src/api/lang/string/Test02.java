package api.lang.string;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String id;
		String pwd;
		while(true) {
		System.out.println("아이디입력: ");
		id = in.next();
		System.out.println("패스워드입력: ");
		pwd = in.next();
		
		if(id.equalsIgnoreCase("khacademy") && pwd.equals("student1234")) {
			System.out.println("로그인 성공");
			break;
		}else {
			System.out.println("로그인 실패");
		}
		}
		
		
	}
}
