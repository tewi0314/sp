package api.util.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		//List 생성
		
		List<Integer> a = new ArrayList<>();
		List<String> b = new LinkedList<String>();
		
		a.add(1);
		a.add(100);
		a.contains(1);
		System.out.println(a.contains(1));
		System.out.println(a.size());
		
		System.out.println(a.indexOf(1));
		System.out.println(a.indexOf(0));
		
		a.remove(0);
		
		System.out.println(a.get(0));
		
		
	}
}
