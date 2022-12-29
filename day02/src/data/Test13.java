package data;
import java.lang.*;
public class Test13 {
	public static void main(String[] args) {
		double fee = 1300/60.0;
		int time = 13*60+35 - (9*60+50);
		
		double totalFee = fee * time / 100;
		totalFee = Math.floor(totalFee);
		System.out.println(totalFee*100);
	}
}
