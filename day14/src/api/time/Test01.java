package api.time;

import java.time.LocalDate;
import java.time.Period;

public class Test01 {
	public static void main(String[] args) {
		//Java 8+ 에서 나온 java.time 패키지 사용법
		//-명령이 간단해짐
		//-날짜와 시간이 분리
		//-출력과 계산이 모두 용이(새로운 방식)
		
		//ex : 날짜만 사용(LocalDate)
		LocalDate al = LocalDate.now();
		System.out.println(al.getYear());
		System.out.println(al.getMonthValue());
		System.out.println(al.getDayOfMonth());
		
		LocalDate a2 = LocalDate.of(2023, 1,13);
		System.out.println(a2);
		
		LocalDate a3 = LocalDate.parse("2023-06-23");
		System.out.println(a3);
		//차이 계산
		Period period = Period.between(al, a3);
		System.out.println(period.getDays());
	}
}
