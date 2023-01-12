package oop.inherit6;

public class IPhone14 extends IPhone {
	private String name = "IPhone14";
	IPhone14(String color, String num){
		this.setColor(color);
		this.setNum(num);
		
	}
	public void facetime() {
		System.out.println(this.name+ " 영상통화 기능 실행");
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
