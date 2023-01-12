package oop.interface2;

public class Test3_1 {
	public static void main(String[] args) {
		Calculator c = (a,b) -> a+b;
		
		System.out.println(c.process(10,20));
	}
}
