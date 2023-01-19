package api.util.collection4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("khacademy", "master1234");
		map.put("khstudent", "study1234");
		map.put("khmanager", "admin1234");
		
		Scanner in = new Scanner(System.in);
		System.out.print("아이디 입력: ");
		String id = in.next();
		System.out.print("비밀번호입력: ");
		String pwd = in.next();
		try {
		if(map.get(id).equals(pwd)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패, 비밀번호가 틀렸습니다.");
		}
		}
		catch(Exception e){
			System.err.print("로그인 실패, 없는 아이디 입니다.");
		}
	}
}
