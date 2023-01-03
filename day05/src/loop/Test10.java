package loop;
import java.util.Scanner;
public class Test10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total = 0;
		for(int i=0;i<5;i++) {
			total += in.nextInt();
		}
		
		double avg = total/5.0;
		System.out.println("평균: " + avg);
	}
}
