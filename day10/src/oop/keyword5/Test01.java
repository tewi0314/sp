package oop.keyword5;

public class Test01 {
	public static void main(String[] args) {
		Deposit[] a = new Deposit[3];
		a[0] = new Deposit("유재석", 0.3, 5000000);	
		a[1] = new Deposit("강호동", 0.5, 3500000);	
		a[2] = new Deposit("신동엽", 0.2, 8000000);	
		a[0].setBasicRate(0.1);
		for(int i=0;i<a.length;i++) {
			a[i].output();
		}
	}
}
