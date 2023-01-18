package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random r = new Random();
		
		for(int i=0;i<6;i++) {
			list.add(r.nextInt(45)+1);
			for(int j=i-1;j>=0;j--) {
				if(list.get(i) == list.get(j)) {
					list.remove(i);
					i--;
					break;
				}
			}
		}
		
		System.out.println(list);
		
	}
}
