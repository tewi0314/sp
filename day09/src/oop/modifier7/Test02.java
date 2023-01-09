package oop.modifier7;

public class Test02 {
	public static void main(String[] args) {
		Grade a = new Grade("마리오", 1, 90, 80, 70);
		Grade b = new Grade("루이지", 1, 85, 85, 83);
		Grade c = new Grade("쿠파", 3, 70, 60, 55);
		
		a.output();
		b.output();
		c.output();
	}
}
