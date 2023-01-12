package oop.keyword3;

public class GalaxyFold4 {
	private String company;
	private String number;
	private String color;
	
	public GalaxyFold4(String number, String color) {
		this.setCompany("삼성");
		this.setNumber(number);
		this.setColor(color);
	}
	
	public void output() {
		System.out.println("제조사: " + getCompany());
		System.out.println("전화번호: " + getNumber());
		System.out.println("색상: " +getColor());
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
