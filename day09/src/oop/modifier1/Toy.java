package oop.modifier1;

public class Toy {
	String name;
	int price;
	
	Toy(String name, int price){
		this.setName(name);
		this.setPrice(price);
	}
	
	void setName(String name) {
		this.name = name;
	}
	void setPrice(int price) {
		if(price>=0) {
			this.price = price;
		}
	}
	
	String getName() {
		return this.name;
	}
	int getPrice() {
		return this.price;
	}
	
	void output() {
		System.out.println(this.name +" " +this.price);
	}
}
