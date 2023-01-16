package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		//Calendar c = new Calendar();//직접 생성 불가
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		//출력하는 방법
		//[1] 정보를 하나씩 꺼내어 출력
		//- .get(항목) 명령으로 원하는 항목 추출
		//- 반드시 추출할 항목에 대한 정보를 인자로 전달
		int year = c.get(Calendar.YEAR);
		System.out.println("year = " + year);
		
		
		//(주의) 월은 0~11로 관리되므로 실제 설정/추출시 보정되야 한다.
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println("month = " + month);
		
		int day = c.get(Calendar.DATE);
		System.out.println("day = " + day);
		int day2 = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("day2 = " + day2);
		//[2] java.util.Date로 변경하여 출력
		Date d = c.getTime();
		Format f4 = new SimpleDateFormat("yyyy-MM-dd E H:mm:ss");
		System.out.println(f4.format(d));
		
		
	}
}
