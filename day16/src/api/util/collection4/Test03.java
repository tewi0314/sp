package api.util.collection4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("검색어를 입력하세요: ");
			String s = in.nextLine();
			
			s = s.toLowerCase();
			s = s.replace(" ", "");
			
			if(s.equals("종료")) {
				System.out.println("종료합니다.");
				break;
			}
			if(!map.containsKey(s)) {
				map.put(s, 1);
			}else {
				map.put(s, map.get(s)+1);
			}
			System.out.println("[" + s + "] 검색이 완료되었습니다. 현재 검색횟수 [" + map.get(s) + "회]" );
		}
		
	}
}
