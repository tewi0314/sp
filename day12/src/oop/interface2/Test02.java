package oop.interface2;

public class Test02 {
	public static void main(String[] args) {
		//람다?
		//-추론을 할 수 있는 축약된 식을 말함
		//안써도 되는 코드를 생략
		//함수형 프로그래밍을 위해 자바에서 제공하는 방법
		
		//반드시 지켜야할 것
		//-인터페이스 일 것
		//-메소드를 1개만 가질 것(함수형 인터페이스)
		
		//등장시기: Java 8+
		Button menu = () -> {
			System.out.println("메뉴표시");
		};
		menu.push();
		
		Button exit = () -> System.out.println("프로그램 종료");
		exit.push();
	}
}
