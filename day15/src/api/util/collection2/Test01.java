package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test01 {
	public static void main(String[] args) {
		//Set
		//-정해진 방식에 의해 데이터를 저장하는 중복 없는 저장소
		
		Set<Integer> set = new TreeSet<>();
		
		set.add(5);
		set.add(3);
		
		System.out.println(set);
		
		System.out.println(set.contains(3));
		
		//indexOf 없음
		//get() 없음
		
		for(int n : set) {
			System.out.println(n);
		}
		
	}
}
