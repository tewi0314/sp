package oop.test4;

import java.util.Arrays;

public class Player {
	String name;
	String event;
	String season;
	int[] medal = new int[3];
	
	Player(String name, String event, String season){
		
		this.name = name;
		this.event = event;
		this.season = season;
	}
	
	public void output() {
		System.out.println(this.name + " " + Arrays.toString(medal));
	}
	
	public void set(String name, int a, int b, int c) {
		this.name = name;
		medal[0] = a;
		medal[1] = b;
		medal[2] = c;
	}
}
