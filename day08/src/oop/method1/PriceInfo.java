package oop.method1;

public class PriceInfo {
	String tong;
	String sang;
	int price;
	int data;
	int min;
	int num;
	
	public void set(String tong, String sang, int price, int data, int min, int num) {
		this.tong = tong;
		this.sang = sang;
		this.price = price;
		this.data = data;
		this.min = min;
		this.num = num;
	}
	
	public void output() {
		System.out.println(this.tong + " " + this.sang +" " + this.price + " " + this.data + " " + this.min +" " + this.num);
	}
}
