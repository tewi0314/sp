package api.lang.string;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		boolean check = true;
		int a = 1;
		while(a>0) {
		if(s.length()<2 || s.length()>7) {
			System.out.println("잘못입력 됐습니다.");
			check = false;
			break;
		}
		
		for(int i=0;i<s.length();i++) {
			if((int)s.charAt(i)<(int)'가') {
				System.out.println("잘못입력 됐습니다.");
				check = false;
				break;
			}
		}	
		a--;
		}
		
		if(check == true) {
			System.out.println("등록되었습니다.");
		}
	}
}
