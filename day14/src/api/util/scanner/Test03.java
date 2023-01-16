package api.util.scanner;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		String colors = "빨강-주황,노랑=초록+파랑-남색@보라";
		Scanner in = new Scanner(colors);
		
		//단어 기준을 변경할 수 있다(단, 바꾸면 이전 기준이 없어짐)
		//in.useDelimiter("\\+");
		in.useDelimiter("[,=+\\-@]");
		while(in.hasNext()) {
			String color = in.next();
			System.out.println("color = " + color);
		}
	}
}
