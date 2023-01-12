package oop.interface2;

public class Test3_2 {
	public static void main(String[] args) {
		//Calculator를 사용한 연산
		Calculator plus = (a,b) -> a+b;
		Calculator multi = (a,b) -> a*b;
		System.out.println(plus.process(multi.process(4, 4), 2));
	}
}
