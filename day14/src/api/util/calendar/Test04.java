package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		//2023년 중 하루 추첨
		Calendar c = Calendar.getInstance();
		
		//월: 1월부터 12월 까지 중 설정 (0~11)
		//일: 1일부터 31일까지 중 설정
		Random r = new Random();
		int month = r.nextInt(12) + 1;
		int date = r.nextInt(31) + 1;
		
		c.set(2023,month-1,date);
		Format f = new SimpleDateFormat("yyyy-MM-dd E");
		System.out.println(f.format(c.getTime()));
	}
}
