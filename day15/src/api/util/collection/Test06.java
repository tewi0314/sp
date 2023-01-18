package api.util.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		List<String> linked = new LinkedList<>();
		String s;
		try(Scanner in = new Scanner(System.in);) {
			int n = in.nextInt();
			if(n<2 || n>24)
				throw new Exception("인원수는 2이상 24이하");
			while(n!=0) {
				s = in.next();
				if(linked.contains(s)) {
					System.out.println("게임오버");
					break;
				}
				linked.add(s);
				n--;
			}
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
		
		Iterator<String> iter = linked.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		/*
		 * for(String s2 : linked) { System.out.print(s2 + " "); }
		 */
		
	}
}
