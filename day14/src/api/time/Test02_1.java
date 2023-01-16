package api.time;

import java.time.Duration;
import java.time.LocalTime;

public class Test02_1 {
	public static void main(String[] args) {
		String in = "14:30";
		String out = "15:40";
		
		LocalTime inTime = LocalTime.parse(in);
		LocalTime outTime = LocalTime.parse(out);
		
		Duration duration = Duration.between(inTime, outTime);
		
		System.out.println("inTime = " + inTime);
		System.out.println("outTime = " + outTime);
		
		long second = duration.getSeconds();
		
		long min = second/60L;
		System.out.println(min);
		
		int pricePerHour = 1000;
		double pricePerMin = pricePerHour/60.0;
		
		long price = (long)(pricePerMin*min);
		System.out.println(price);
	}
}
