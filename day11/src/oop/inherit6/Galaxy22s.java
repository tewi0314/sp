package oop.inherit6;

public class Galaxy22s extends Galaxy {
	private String name = "갤럭시22s";
	Galaxy22s(String num, String color){
		this.setNum(num);
		this.setColor(color);
	}
	public void bixby() {
		System.out.println(this.name+ " 음성인식 기능 실행");
	}
	@Override
	public void samsungPay() {
		System.out.print(this.name + " ");
		super.samsungPay();
	}
	
	@Override
	public void sms() {
		System.out.print(this.name + " ");
		super.sms();
	}
	
	@Override
	public void call() {
		System.out.print(this.name+ " ");
		super.call();
	}
	
	
}
