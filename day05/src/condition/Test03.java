package condition;
import java.util.Scanner;
public class Test03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int year = in.nextInt();
		int month = in.nextInt();
		
		boolean y = (year%400==0 || year%100!=0 && year%4 ==0);
		
		switch(month){
			case 1,3,5,7,8,10,12 :  System.out.println("31"); break;
			case 4,6,9,11 : System.out.println("30"); break;
			case 2: if(y) {
				System.out.println(29); 
				break;
			}else {
				System.out.println(28); 
				break;
			}
		}
	}
}
