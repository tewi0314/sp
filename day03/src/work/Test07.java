package work;

public class Test07 {
	public static void main(String[] args) {
		int vel = 80;
		int basicPenalty = 30000;
		int standardVel = 50;
		
		int penalty = 0;
		
		if(vel>standardVel) {
			penalty += basicPenalty + (vel-standardVel)/10*10000;
		}
		
		System.out.println(penalty);
	}
}
