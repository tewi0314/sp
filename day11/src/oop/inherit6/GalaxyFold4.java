package oop.inherit6;

public class GalaxyFold4 extends Galaxy {
	private String name = "갤럭시폴드4";
	
	public void iris() {
		System.out.println(this.name+" 홍채인식 기능 실행");
	}

	@Override
	public void samsungPay() {
		// TODO Auto-generated method stub
		System.out.print(this.name + " ");
		super.samsungPay();
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
