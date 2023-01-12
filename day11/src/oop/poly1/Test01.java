package oop.poly1;

public class Test01 {
	public static void main(String[] args) {
		Pororo p = new Pororo();
		p.hello();
		
		Crong c = new Crong();
		c.hello();
		
		Toy t1 = new Pororo();
		t1.hello();
		Toy t2 = new Crong();
		t2.hello();
	}
}
