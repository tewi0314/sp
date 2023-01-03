package loop;
import java.util.Scanner;
public class Test09 {
	
	static int prime(int n) {
		int b = (int)Math.sqrt(n);
		for(int i=2;i<=b;i++) {
			if(n%i==0) return -1;
		}
		return n;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		
		int result = prime(a);
		if(result == -1) System.out.println("소수가 아닙니다.");
		else System.out.println(a + " 는 소수입니다.");
	}
}
