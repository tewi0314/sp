package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
public class Test05 {
	public static void main(String[] args) {
		//Collections를 도와주는 Collections 클래스
		
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<=10;i++) {
			list.add(i);
		}
		
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list);
		Collections.sort(list, comp);
		System.out.println(list);
	}
	
	public static Comparator<Integer> comp = new Comparator<>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2-o1;
		}
		
	};
}
