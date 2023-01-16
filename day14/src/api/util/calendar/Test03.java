package api.util.calendar;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) throws ParseException {
		//우리 과정의 수료일은 2023년 6월 13일 입니다,
		//수료 100일 전부터 이력서를 작성하기로 마음먹었을 떄 이력서 작성을 시작해야하는 날이 언제인지 출력하세요
		
		Scanner in = new Scanner(System.in);
		System.out.print("날짜 입력: ");
		String input = in.next();
		in.close();
		//String 날짜 형식을 Date로 변환 할 수 있다(SimpleDateFormat 고유기능)
		SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
		Date time = parser.parse(input);
		
		Calendar c = Calendar.getInstance();
		Format f = new SimpleDateFormat("yyyy-MM-dd E");
		
		c.set(2023, 5, 13);
		c.set(2023,5, 13-100);
		System.out.println(f.format(c.getTime()));
		
		Random r = new Random();
		
		c.set(2023, 5, 17+r.nextInt(8)*7+r.nextInt(2));
		System.out.println(f.format(c.getTime()));
		System.out.println(f.format(c.getTime()));
	
		c.setTime(time);
		System.out.println(f.format(c.getTime()));
	}
}
