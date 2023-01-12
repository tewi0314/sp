package oop.abstrac;

//추상클래스(abstract class)
//- 상속을 위한 상위 클래스
//- 일반 클래스와 다른점이 세 가지 있다
// 1. 클래스에 abstract라고 꼭 표시
// 2. 객체생성이 불가능해진다
// 3. 추상 메소드를 가질 수 있다.

public abstract class Mobile {
	//필드 - 일반 클래스와 달라지는 부분이 없다
	protected String number;
	protected String color;
	
	//생성자 - 일반 클래스와 동일
	public Mobile(String color) {
		this.color = color;
	}
	
	//메소드 - 추상메소드와 일반메소드로 구현
	//추상메소드는 이름은 아는데 내용을 모를 때
	public abstract void call();
	public abstract void sms();
	public void output() {
		System.out.println("번호: " + number);
		System.out.println("색상: " + color);
	}
}
