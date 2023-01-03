package loop;
import java.util.Scanner;
public class Test05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int min = in.nextInt();
		int second = in.nextInt();
		
		int total = 60*min+second;
		
		for(int i=0;i<total;i++) {
			System.out.println(min+"분 " + second +"초 후 알람이 울립니다.");
			if(second>=1) second --;
			else {
				second = 59;
				min--;
			}
		}
		System.out.println("시간이 다 되었습니다!");
	}
}
