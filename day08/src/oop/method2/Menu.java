package oop.method2;

public class Menu {
	String name;
	String sort;
	int price;
	String event;
	
	public void set(String name, String sort, int price, String event) {
		this.name = name;
		this.sort = sort;
		this.price = price;
		this.event = event;
	}
	
	public void output() {
		if(this.event.equals("행사중")) {
			this.price*=0.8;
			System.out.println(this.name + " " + this.sort+ " " + this.price + " " + this.event);

		}else {
			System.out.println(this.name + " " + this.sort+ " " + this.price);

		}
	}
}
