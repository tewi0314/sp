package oop.keyword2;
import java.util.Scanner;
public class Test01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String id = in.next();
		String pass = in.next();
		Member m1 = new Member(id, pass);
		
		m1.output();
		m1.setPoint(120);
		m1.output();
	}
}
