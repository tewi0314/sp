package oop.inherit6;

public class IPhone13 extends IPhone{
	private String name = "IPhone13";
	IPhone13(String num, String color){
		this.setColor(color);
		this.setNum(num);
	}
	public void itunes() {
		System.out.println("IPhone13 아이튠즈 기능 실행");
	}
	@Override
	public void siri() {
		// TODO Auto-generated method stub
		System.out.print(this.name+ " ");
		super.siri();
	}
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.print(this.name+ " ");
		super.call();
	}
	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.print(this.name+ " ");
		super.sms();
	}
	
	
}
