package loop;
import java.util.Scanner;
public class Test12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("몇 단 입니까?");
		int n = in.nextInt();
		int answer;
		int result = 0;
		System.out.println("정답을 입력하세요: ");
		for(int i=1;i<=9;i++) {
			System.out.print(n + " x " + i + " = ");
			answer = in.nextInt();
			if(answer == n*i) {
				System.out.println("정답!");
				result++;
			}
			else {
				System.out.println("오답!");
							}
		}
		
		System.out.println("정답 개수: " + result);
		
		for(int i=1;i<=9;i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}
		
	}
}
