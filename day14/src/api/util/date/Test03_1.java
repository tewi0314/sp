package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test03_1 {
	public static void main(String[] args) {
//		변환 기본 언어 설정
		Locale.setDefault(Locale.CHINA);
		
		Date d = new Date();
//      2023년 1월 16일 월
//		SimpleDateFormat f1 = new SimpleDateFormat("y년 M월 d일 E");
		Format f1 = new SimpleDateFormat("y년 M월 d일 E");
		System.out.println(f1.format(d));
		
//     	오전 10시 40분
		Format f2 = new SimpleDateFormat("a h시 m분");
		System.out.println(f2.format(d));
		
// 		10:40:35
		Format f3 = new SimpleDateFormat("HH:mm:ss");
		System.out.println(f3.format(d));
		
// 		2023-01-16 월 10:40:35
		Format f4 = new SimpleDateFormat("yyyy-MM-dd E H:mm:ss.SSS");
		System.out.println(f4.format(d));
	}
}
