package condition2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test04 {
	public static void main(String[] args) {
		LocalDate now1 = LocalDate.now();
		LocalTime now2 = LocalTime.now();
		
		System.out.println(now1);
		System.out.println(now2);
		
		String time = "2023-01-02 12:50:30";
		
		String year = time.substring(0,4);
		String month = time.substring(5,7);
		String day = time.substring(8,10);
		
		int a = Integer.parseInt(month);
		int b = Integer.parseInt(day);
		int c= Integer.parseInt(year);
		
		int n_year = now1.getYear(); 
		int n_month = now1.getMonthValue();
		int n_day = now1.getDayOfMonth();
		
		if(n_year>c || (n_year ==c && n_month > b) ) {
			System.out.println("오래전 입니다.");
		}
	}
}
