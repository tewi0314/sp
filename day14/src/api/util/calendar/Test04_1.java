package api.util.calendar;

import java.util.Calendar;
import java.util.Random;

public class Test04_1 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Random r = new Random();
		c.set(2023, 1, 1);
		
		while(true) {
		int month = r.nextInt(12)+1;
		c.set(Calendar.MONTH, month-1);
		
		int max = c.getActualMaximum(Calendar.DATE);
		int date = r.nextInt(31)+1;
		c.set(Calendar.DATE, date);
		
		//요일을 구하는 방법
		//1.숫자로 추출
		//2. 문자열로추출
		//week 1 = 일요일
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		if(week == Calendar.SUNDAY || week == Calendar.SATURDAY) {
			System.out.println("주말");
			break;
		}else {
			System.out.println("주중");
		}
	}
}
}