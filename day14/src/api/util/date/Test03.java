package api.util.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
public class Test03 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalTime now1 = LocalTime.now();
		DayOfWeek dayOfWeek = now.getDayOfWeek();
		System.out.print(now + " ");
		System.out.print(dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.KOREAN) + " ");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formatedNow = now1.format(formatter);
		System.out.println(formatedNow);
	}
}
