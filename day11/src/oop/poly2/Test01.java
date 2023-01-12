package oop.poly2;
import java.util.Scanner;
public class Test01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("1.전사 2.마법사 3.궁수 선택하세요: ");
		int n = in.nextInt();
		System.out.println("아이디를 입력하세요: ");
		String id = in.next();
		
		Class a = new Magician(id);
		
		switch(n) {
		case 1: a = new Warrior(id);
				break;
		case 2: a = new Magician(id);
				break;
		case 3: a = new Archer(id);
				break;
		default: System.out.println("잘못된 입력입니다.");
				break;
		}
		
		System.out.println("1.공격 2.이동 3.상점 4.정보 선택하세요: ");
		n = in.nextInt();
		
		switch(n) {
		case 1: a.atk();
				break;
		case 2: a.move();
				break;
		case 3: a.store();
				break;
		case 4: a.info();
				break;
		default: System.out.println("잘못된 입력입니다.");
				break;
		}
		
		a.setLv(99);
		a.info();
		System.out.println(a);
	}
}
