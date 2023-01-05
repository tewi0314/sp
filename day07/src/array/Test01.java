package array;
import java.util.Arrays;
import java.util.Scanner;
public class Test01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] s = new String[5];
		
		for(int i=0;i<s.length;i++) {
			s[i] = in.next();
		}
		
		System.out.println(Arrays.toString(s));
	}
}
