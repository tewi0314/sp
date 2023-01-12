package oop.abstrac;

public class IPhone13 extends IPhone{

	public IPhone13(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void siri() {
		// TODO Auto-generated method stub
		System.out.println("아이폰13 음성인식");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("아이폰13 전화");
	}

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("아이폰 문자");
	}
	
	public void itunes() {
		System.out.println("아이폰 아이튠즈");
	}
	
}
