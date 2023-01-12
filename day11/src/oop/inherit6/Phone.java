package oop.inherit6;

public class Phone {
	private String num;
	private String color;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void call() {
		System.out.println("전화기능 실행");
	}
	public void sms() {
		System.out.println("문자기능 실행");
	}
}
