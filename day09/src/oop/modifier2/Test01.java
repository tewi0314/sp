package oop.modifier2;

public class Test01 {
	public static void main(String[] args) {
		Student a = new Student("피카츄", 100, 20, 80);
		Student b = new Student("라이츄", -1, 90, 80);
		Student c = new Student("파이리", 40, 90, 80);
		a.setEng(100);
		a.output();
		b.output();
		c.output();
	}
}
