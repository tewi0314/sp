package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test04 {
	public static void main(String[] args) {
		
		//데이터 준비
		Set<String> galaxy = Set.of("통화", "문자", "게임");
		Set<String> iphone = Set.of("통화", "문자");
		
		//합집합
		Set<String> union = new TreeSet<>();
		union.addAll(galaxy);
		union.addAll(iphone);
		
		System.out.println(union);
		
		//교집합
		Set<String> intersect = new TreeSet<>(galaxy);
		intersect.retainAll(iphone);
		System.out.println(intersect);
		
		//차집합 - 어느 한 쪽 휴대폰만 가진 기능
		Set<String> minus = new TreeSet<>(galaxy);
		minus.removeAll(iphone);
		System.out.println(minus);
	}
}
