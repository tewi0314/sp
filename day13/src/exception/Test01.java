package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//(예) 1/n 계산기
		
		Scanner in = new Scanner(System.in);
		
		try {//문제가 발생하리라 예상되는 지역 (플랜 A)
		System.out.println("금액: ");
		int money = in.nextInt();
		
		System.out.println("인원: ");
		int people = in.nextInt();
		in.close();
		
		int result = money / people;
		int remain = money%people;
		System.out.println("1인당 " + result + "원");
		System.out.println("자투리 " + remain + "원");
	
		} catch(InputMismatchException e) { //입력이 잘못되었을 때 플랜 B
			System.err.println("입력을 똑바로 하세요");
		} catch(ArithmeticException e) { //나누기가 잘못되었을 때 플랜 B
			System.err.println("인원수는 0일 수 없습니다.");
		}
		
		
		
	}
}
