package api.lang.string;

import java.util.regex.Pattern;

public class Test08 {
	public static void main(String[] args) {
		String s = "abcdefgh__aaaaaaaaaaaaaaaaaaaaaaa";
		String regex = "^[a-z]{1}([a-z]|[0-9]|_){7,19}$";
		
		if(Pattern.matches(regex, s)) {
			System.out.println("올바른 이름");
		}else {
			System.out.println("잘못된 이름");
		}
	}
}
