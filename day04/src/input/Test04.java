package input;
import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int height = in.nextInt();
		double weight = in.nextDouble();
		in.close();
		double bmi = weight/(height*height);
		
		if(bmi>=24.5) {
			System.out.println("과체중");
		}else {
			System.out.println("저체중");
		}
		
	}
}
