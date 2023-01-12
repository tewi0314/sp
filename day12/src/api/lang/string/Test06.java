package api.lang.string;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String[] slang = new String[] {"신발", "수박", "십장생", "변신", "주옥", "시베리아", "개나리", "잣"};
		
		for(int i=0;i<slang.length;i++) {
			if(s.contains(slang[i])) {
				String s1= "";
				for(int k=0;k<slang[i].length();k++){
					s1+="*";
				}
				s = s.replace(slang[i], s1);
			}
		}
		String s2 = "*".repeat(slang[2].length());
		System.out.println(s2);
		System.out.println(s);
	}
}
