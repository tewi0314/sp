package day03;
import java.time.LocalDate;
public class Test02 {
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		
		int birth = 2000;
		int year = now.getYear();
		
		int adultAge = 20;
		
		boolean adult = year-birth+1>=adultAge;
		System.out.println(adult);
	}
}
