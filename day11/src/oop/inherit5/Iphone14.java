package oop.inherit5;

public class Iphone14 extends Phone {
	public void info() {
		System.out.println(number); //this가 생략됨
	}
	
	//메소드 오버라이드(method override, 메소드 재정의)
	//- 기존 메소드의 코드가 마음에 들지 않아 다른 코드로 교체하고 싶을 때 사용
	//- 부모 클래스에 있는 형태와 똑같이 구현
	//@Override와 같은 코드를 어노테이션(Annotation)이라고 한다
	//명찰을 부착하여 하단 코드의 역할을 정의한다
	
	@Override
	public void videoCall() {
		// TODO Auto-generated method stub
		System.out.println("영상을 재생할 수 없습니다.");
	}
	
	//부모 클래스인 Phone에서 생성 시 필요한 number를 전달할 수 있는 생성자를 구현
	//=> 이 요구사항을 지키지 못하면 상속은 근본적으로 불가능
	
	public Iphone14(String number) {
		super(number);
	}
}
