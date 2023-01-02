package input;
import java.util.Scanner;
public class Test02 {
	public static void main(String[] args) {
		//목표: Scanner를 System.in에 결합하여 사용
		
		//도구생성
		//- 자동 import : ctrl+shif+O
		//- new는 우측에 적힌 내용을 새로 만들라는 의미의 연산자(동적할당연산자)
		//- sc는 참조변수(리모컨)이며 생성한 입력도구
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		int n = sc.nextInt();
		System.out.println("n= " +n);
		
		System.out.println("정수 입력");
		int m = sc.nextInt();
		System.out.println("m = " + m);
		
		System.out.println("실수 입력");
		double d = sc.nextDouble();
		System.out.println("d = " + d);
	}
}
