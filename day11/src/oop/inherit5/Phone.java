package oop.inherit5;

//상속 구현시 염두해둬야할 사항
//1.필드는 접근 제한 설정에 유의해야한다
//-private는 상속관계 없이 자신만 접근 가능
//-protected는 같은 패키지+자식 클래스들은 제한없이 접근 가능
//2.메소드 override(재정의) 가능 여부를 결정해야 한다
// -final 키워드를 추가하면 메소드가 불변이 되어 재정의가 불가능하다
// -abstract 키워드를 추가하면 메소드를 무조건 재정의해야한다.
// -아무 키워드를 붙이지 않으면 재정의 여부를 자식 클래스가 선택할 수 있다.
//3.생성자
// -객체를 만들 때 반드시 지켜야하는 필수 데이터를 설정하는 코드

public class Phone {
	//private String number
	protected String number;
	
	public void videoCall() {
		System.out.println("영상을 재생합니다.");
	}
	
	public void sms() {
		System.out.println("문자 기능 실행");
	}
	
	//휴대폰이라면 전화번호가 반드시 있어야 해요=> 생성자 구현
	public Phone(String number) {
		this.number = number;
	}
	
}
