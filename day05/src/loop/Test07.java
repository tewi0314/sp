package loop;
import java.util.Scanner;
public class Test07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 5;
		int count = 0;
		for(int i=0;i<30;i++) {
			System.out.print(a+ " ");
			count +=a;
			a+=2;
		}
		System.out.println();
		System.out.println("총 갯수: " + count);
	
		int first = in.nextInt();
		int plus = in.nextInt();
		int period = in.nextInt();
		
		count = 0;
		
		for(int i=0;i<period;i++) {
			System.out.print(first + " ");
			count += first;
			first+=plus;
		}
		System.out.println();
		System.out.println("총 갯수: " + count);
	}
}
