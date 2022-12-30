package work;

public class Test08 {
	public static void main(String[] args) {
		int num = 2;
		int day = 3;
		int month = 6;
		int fee = 10;
		double totalFee = num*(day-1)*fee;
		if(month<0 || month>12) System.out.println("달이 잘못 입력되었습니다.");
		else if(month>=6 && month<=8) {
			totalFee*=0.75;
		}
		System.out.println(totalFee);
	}
}
