package api.lang.string;

import java.util.regex.Pattern;

public class Test09 {
	public static void main(String[] args) {
		String s = "111-534-1234";
		String regex = "^01[016789]-[0-9]{3,4}-[0-9]{4}$";
		
		if(Pattern.matches(regex, s)) {
			System.out.println("올바른 이름");
		}else {
			System.out.println("잘못된 이름");
		}
	}
}
