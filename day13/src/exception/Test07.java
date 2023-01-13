package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		//문제점: 개발자는 원래 발생하던 오류메세지를 보고싶어한다
		
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
		in.close();
		
		int result = money / people;
		int remain = money%people;
		System.out.println("1인당 " + result + "원");
		System.out.println("자투리 " + remain + "원");
	
		} catch(Exception e) { //입력이 잘못되었을 때 플랜 B
			//e.printStackTrace();
		}
			
		
		
		
	}
}
