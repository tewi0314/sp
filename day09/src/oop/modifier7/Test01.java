package oop.modifier7;
import oop.modifier6.Ncs;

public class Test01 {
	public static void main(String[] args) {
		Ncs a = new Ncs("피카츄", "응용SW기초기술활용", -20, 60);
		Ncs b = new Ncs("라이츄", "응용SW기초기술활용", 40, 80);
		Ncs c = new Ncs("파이리", "응용SW기초기술활용", 60, 65);

		a.output();
		b.output();
		c.output();
	}
}
