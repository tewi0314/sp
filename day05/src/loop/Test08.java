package loop;

public class Test08 {
	public static void main(String[] args) {
		int day = 30;
		int money = 1;
		long total = 0;
		for(int i=0;i<day;i++) {
			System.out.print(money+" ");
			total+=money;
			money*=2;
		}
		
		System.out.println();
		System.out.println(total);
		
		for(int i=0;i<10;i++) {
			total+=money;
			money*=2;
		}
		
		System.out.println(total);
	}
}
