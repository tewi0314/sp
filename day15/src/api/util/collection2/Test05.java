package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test05 {
	public static void main(String[] args) {
		Set<String> set1 = Set.of("아바타", "슬램덩크", "영웅");
		Set<String> set2 = Set.of("영웅", "올빼미", "스위치", "신비아파트");
		
		Set<String> gyo = new TreeSet<>(set1);
		gyo.retainAll(set2);
		
		System.out.println(gyo);
		
		Set<String> hap = new TreeSet<>(set1);
		hap.addAll(set2);
		
		System.out.println(hap);
		
		Set<String> alone = new TreeSet<>(hap);
		hap.removeAll(gyo);
		System.out.println(hap);
	}
}
