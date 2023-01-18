package api.util.collection2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test03 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		try(Scanner in  = new Scanner(System.in);){
		
		while(true) {
			System.out.print("좋아요를 누를 글 번호를 입력하세요: ");
			int n = in.nextInt();
			if(n<0) throw new Exception("번호는 0 이상이어야 합니다.");
			if(n==0) {
				System.out.println("종료합니다.");
				break;
			}
			
			if(set.contains(n)) {
				System.out.println(n + "번 글에 좋아요를 취소했습니다.");
				set.remove(n);
			}else {
				System.out.println(n + "번 글에 좋아요를 눌렀습니다.");
				set.add(n);
			}
			
			
		}
		
		System.out.println(set);
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
