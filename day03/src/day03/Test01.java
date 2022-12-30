package day03;

public class Test01 {
	public static void main(String[] args) {
		boolean a = true;
		System.out.println(a);
		
		int money = 23000;
		int pizza = 20000;
		int coke = 3500;
		
		//boolean order = false;
		//boolean order = pizza 랑 coke를 합친 금액이 money 이하 인가요?
		
		boolean order = pizza+coke<=money;
		System.out.println(order);
	}
}
