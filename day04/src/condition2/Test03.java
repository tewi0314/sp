package condition2;

import java.time.LocalDate;

public class Test03 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		
		int year = 2023;
		int now_year = now.getYear();
		int age = now_year - year + 1;
		
		int fee = 0;
		
		boolean card = false;
		if(age>=65) {
			fee += 0;
		}else if(age>=20) {
			fee += 1250;
		}else if(age>=14) {
			fee += 720;
		}else if(age>= 8) {
			fee += 450;
		}
		
		if(card == false) {
			fee += 500;
		}
		
		System.out.println(fee);
	}
}
