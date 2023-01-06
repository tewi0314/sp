package oop.method1;

public class Test01 {
	public static void main(String[] args) {
		PriceInfo p1 = new PriceInfo();
		PriceInfo p2 = new PriceInfo();
		PriceInfo p3 = new PriceInfo();
		
		p1.set("SK", "5G언택트", 52000, 200, 1000, 2000);
		p2.set("KT", "5G세이브", 45000, 100, 900, 1500);
		p3.set("LG", "5G시그", 130000, 500, 2000, 2500);
		
		p1.output();
		p2.output();
		p3.output();
	}
}
