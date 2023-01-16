package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test02 {
	public static void main(String[] args) {
		//Calendar 를 이용한 날짜 계산
		Calendar c = Calendar.getInstance();
		
		Format f = new SimpleDateFormat("yyyy-MM-dd E a h:mm:ss");
		System.out.println(f.format(c.getTime()));
		
		//날짜 변경: 2023년 1월 1일
		//[1] 연, 월, 일 등을 각각 변경 - .set(항목, 값)
		c.set(Calendar.YEAR, 2023);
		c.set(Calendar.MONTH, 0);
		c.set(Calendar.DAY_OF_MONTH, 1);
		
		System.out.println(f.format(c.getTime()));
		
		//[2] 한 번에 연월일 설정.
		c.set(2022, 0, 1);
		System.out.println(f.format(c.getTime()));
		
		//Calendar는 날짜가 허용되지 않는 값이어도 자동 보정을 해준다
		c.set(2022, 0, -5);
		System.out.println(f.format(c.getTime()));
		
		c.add(Calendar.MONTH, 100);
		System.out.println(f.format(c.getTime()));
		
		//Calendar는 윤년도 자동 계산된다.
		c.set(2001, 1, 29);
		System.out.println(f.format(c.getTime()));
		System.out.println(c.getActualMaximum(Calendar.DATE));
		
		
	}
}
