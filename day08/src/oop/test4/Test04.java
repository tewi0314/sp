package oop.test4;

import java.util.Arrays;

public class Test04 {
	public static void main(String[] args) {
		Player p1 = new Player("진종오", "사격", "하계");
		Player p2 = new Player("123", "사격", "하계");
		Player p3 = new Player("456", "사격", "하계");
		
		int[] arr = new int[] {4,2,0};
		p1.medal = arr.clone();
		arr = new int[] {4,1,0};
		p2.medal = arr.clone();
		arr = new int[] {4,0,1};
		p3.medal = arr.clone();
		
		System.out.println(Arrays.toString(p1.medal));
		System.out.println(Arrays.toString(p2.medal));
		System.out.println(Arrays.toString(p3.medal));
		
		p1.output();
		p2.output();
		p3.output();
		
		p1.set("김", 1, 1, 1);
		p1.output();
	}
}
