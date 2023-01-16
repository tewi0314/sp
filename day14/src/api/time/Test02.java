package api.time;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LocalTime a1 = LocalTime.now();
		System.out.println("시작시간 입력: (HH:MM) " );
		String s = in.next();
		System.out.println("종료시간 입력: (HH:MM) " );
		String s2 = in.next();
		LocalTime start = LocalTime.parse(s);
		
		LocalTime end = LocalTime.parse(s2);
		
		Duration duration = Duration.between(start,end);
		int min = (int)duration.getSeconds()/60;
		int hour = min/60;
		System.out.println("이용시간: " + min + "분");
		System.out.println("요금: " + hour*1000);
	}
}
