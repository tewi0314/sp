package day03;

public class Test07 {
	public static void main(String[] args) {
		int year = 4;
		
		boolean check = year%400==0 || year%100!=0 && year%4==0;
		
		System.out.println(check);
	}
}
