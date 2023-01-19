package api.util.collection4;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		//Map<K,V>
		//- key 와 value가 세트로 저장되는 저장소
		//- key만 보면 Set과 구조가 같음
		//- value는 중복 가능
		//- key로 value를 부를 수 있지만 반대는 안된다.
		Map<String, Integer> data = new HashMap<>();
		
		//데이터 추가
		// - .add()는 한 개 추가하는 명령
		// - .put()은 두 개를 세트로 추가하는 명령
		data.put("허니버터칩" , 3000);
		data.put("참이슬" , 1000);
		data.put("처음처럼" , 2000);
		data.put("카스" , 4000);
		data.put("카스" , 7000);
		
		System.out.println(data);
		System.out.println(data.size());
		
		//검색 - key와 value를 따로 검색하도록 메소드 제공
		System.out.println(data.containsKey("허니버터칩"));
		System.out.println(data.containsValue(7000));
		
		//추출 - key로 value를 추출
//		System.out.println(data.get("허니버터칩"));
//		System.out.println(data.get("짜파게티"));
		
		Integer price = data.get("짜파게티");
		System.out.println("price = " + price);
		
		//삭제 - key를 이용하여 데이터를 삭제
		data.remove("허니버터칩");
		System.out.println(data);
		System.out.println(data.size());
		
	}
}
