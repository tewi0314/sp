package exception;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		try {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String year = "";
		String month = "";
		String day = "";
		for(int i=0;i<s.length();i++) {
			if(i<=3) {
				year+=s.charAt(i);
			}else if(i>=5 && i<=6) {
				month+=s.charAt(i);
			}else if(i>=8 && i<=9) {
				day+=s.charAt(i);
			}
		}
		
		int y = Integer.parseInt(year);
		int m = Integer.parseInt(month);
		int d = Integer.parseInt(day);
		
		System.out.println(year + " " + month + " " + day);
		}
		catch(Exception e){
			System.err.println("잘못된 날짜입력으로 계산이 불가능 합니다.");
		}
	}
}
