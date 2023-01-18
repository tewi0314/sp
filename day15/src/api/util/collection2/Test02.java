package api.util.collection2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test02 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		Random r = new Random();
		while(set.size()!=6) {
			set.add(r.nextInt(45)+1);
		}
		
		System.out.println(set);
	}
}
