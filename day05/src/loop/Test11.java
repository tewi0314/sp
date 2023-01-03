package loop;
import java.util.Scanner;
public class Test11 {
	
	static double avg(Scanner in, int n) {
		int total = 0;
		for(int i=0;i<n;i++) {
			total += in.nextInt();
		}
		return (double)total/n;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double b = avg(in, n);
		System.out.println(b);
	}
}
