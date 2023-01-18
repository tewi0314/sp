package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("명수 입력: ");
		int n = in.nextInt();
		int n2 = n;
		String s;
		List<String> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		while(n2!=0) {
			System.out.print("이름 입력: ");
			s = in.next();
			list.add(s);
			n2--;
		}
		
		while(n!=0) {
			System.out.print("당첨 입력: ");
			s = in.next();
			list2.add(s);
			n--;
		}
		
		Collections.shuffle(list2);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i) + " " + list2.get(i));
		}
		
	}
}
