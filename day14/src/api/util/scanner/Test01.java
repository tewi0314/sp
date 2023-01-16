package api.util.scanner;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		String song = "떳다떳다 비행기 날아라 날아라\n높이높이 날아라 우리 비행기";
		//System.out.println(song);
		
		//Scanner는 단어나 줄 단위로 끊어서 읽는 것이 가능하다.
		//단어 - .next()
		//- .hasNext()를 사용하면 읽을 수 있는 단어가 남아있는지 확인할 수 있다.
		//줄 - .nextLine()
		//- 줄은 개행(\n)만이 의미가 있다
		//- .hasNextLine() 메소드로 더 읽을 수 있는 줄이 남았는지 확인한다.
		
		Scanner in = new Scanner(song);
		
		while(in.hasNextLine()) {
			String word = in.nextLine();
			System.out.println(word);
			}
		
		
		
	}
}
