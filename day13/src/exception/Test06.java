package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		//문제점: 스캐너가 어떨땐 열리고 어떨땐 안 열리는데?
		//원인: 예외 발생여부에 따라 close()가 될때가있고 안될때가 있다.
		
		Scanner in = new Scanner(System.in);
		
		try {//문제가 발생하리라 예상되는 지역 (플랜 A)
		System.out.println("금액: ");
		int money = in.nextInt();
		if(money<=0) {//자바가 감지하지 못하는 예외상황
//			Exception ex = new Exception();
//			throw ex;
			throw new Exception();
		}
		System.out.println("인원: ");
		int people = in.nextInt();
		if(people<0) {
			throw new Exception();
		}
		
		int result = money / people;
		int remain = money%people;
		System.out.println("1인당 " + result + "원");
		System.out.println("자투리 " + remain + "원");
	
		} catch(Exception e) { //입력이 잘못되었을 때 플랜 B
			//e.printStackTrace();
		}
		finally {//예외여부와 관계없이 무조건 실행되는 구문
			in.close();
		}
			
		
		
		
	}
}
