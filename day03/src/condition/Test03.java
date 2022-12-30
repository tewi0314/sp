package condition;

public class Test03 {
	public static void main(String[] args) {
		int age=0;
		int price =7000;
		
		if(age>=65) {
			price/=2;
			System.out.println(price);
		}else {
			System.out.println(price);
		}
	}
}
