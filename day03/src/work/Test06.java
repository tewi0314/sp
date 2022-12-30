package work;
import java.lang.*;
public class Test06 {
	public static void main(String[] args) {
		int startHour = 8, startMin = 30;
		int endHour = 10, endMin = 20;
		int totalFee = 5000;
		int tenMinPerFee = 500;
		int totalTime = endHour*60+endMin - (startHour*60+startMin);
		
		if(totalTime>60) {
			totalFee += (totalTime-60)/10*tenMinPerFee;
		}
		
		System.out.println(totalFee);
	}
}
