package data;
import java.lang.*;
public class Test07 {
	public static void main(String[] args) {
		int fH = 3*60+50;
		int sH = 4*60+25;
		int total = fH+sH;
		System.out.println(total/60+ "시간 " + total%60 + "분");
	}
}
