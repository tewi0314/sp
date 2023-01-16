package api.util.date;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		//프로그램에서 날짜는 어떻게 관리하는가?
		//1.System.currentTimeMills()
		//-측정용 시간
		//-1970년 1월 1일 0시 0분 0초(기준시) 부터 지금까지 흘러온 밀리초(ms)
		
		long a = System.currentTimeMillis();
		System.out.println("a = " + a );
		
		//2.java.util.date 클래스
		//-최초로 등장한 시간 클래스
		//-1900년을 기준으로 버려지는 기능이 많음
		
		Date b = new Date();
		System.out.println("b = " + b);
		
		//3.java.util.Calender
		//-Date를 개선한 클래스
		//-생성 대행 방식을 활용
		Calendar d = Calendar.getInstance();
		System.out.println("d = " + d);
		
		d.set(2023, 5, 13);
		System.out.println(d.getTime());
		
		//4.java.time 패키지
		//-날짜만, 시간만, 날짜와 시간을 같이 쓰고싶은 경우에 맞게 구성
		//-월도 일반적인 방식으로 설정 가능
		
		
	}
}
