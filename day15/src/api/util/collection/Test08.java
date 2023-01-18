package api.util.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test08 {
	public static void main(String[] args) {
		//간단한 list 생성 방법
		//- 데이터가 고정이라면 간편 생성 명령으로 리스트 생성이 가능
		//- 단, 이 방식으로 생성된 리스트는 불변(imutable)이다.
//		List<Integer> list = new ArrayList<>();
		
		//불변(Java 8+)
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		
		//불변(Java 9+)
		List<Integer> list2 = List.of(10,30,40);
		System.out.println(list);
		System.out.println(list2);
		
	}
}
