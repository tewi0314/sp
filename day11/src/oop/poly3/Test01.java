package oop.poly3;

public class Test01 {
	public static void main(String[] args) {
		Hwang a = new Hwang();
		a.drink();
		
		Teacher b = a;
		
		b.teach();
	}
}
