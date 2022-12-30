package data;

public class Test13_2 {
	public static void main(String[] args) {
		int pricePerHour = 1300;
		int startHour = 9,  startMinute = 50;
		int finishHour = 13, finishMinute = 35;
		
		int startTime = startHour*60 + startMinute;
		int finishTime = finishHour*60 + finishMinute;
		int usageTime = finishTime = startTime;
		
		double pricePerMinute = pricePerHour / 60.0;
		int price = (int)(pricePerMinute * usageTime);
		
		int hour = usageTime / 60;
		int minute = usageTime % 60;
		
		System.out.println(pricePerHour / 60.0);
	}
}
