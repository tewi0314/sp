package oop.method2;

public class Test01 {
	public static void main(String[] args) {
		Menu m1 = new Menu();
		Menu m2 = new Menu();
		Menu m3 = new Menu();
		Menu m4 = new Menu();
		
		m1.set("아메리카노", "음료", 2500, "행사중");
		m2.set("모카라떼", "음료", 3500, "");
		m3.set("치즈케이크", "디저트", 5000, "행사중");
		m4.set("마카롱", "디저트", 3000, "");
		
		m1.output();
		m2.output();
		m3.output();
		m4.output();
	}
}
