package input;
import java.util.Scanner;
public class Test06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("닉네임을 입력:");
		
		String nickname = in.next();
		
		in.close();
		
		System.out.println("닉네임: " + nickname);
	}
}
