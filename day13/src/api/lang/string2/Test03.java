package api.lang.string2;

public class Test03 {
	public static void main(String[] args) {
		//StringBuilder 사용
		//- thread-safe 처리(동기화 처리)가 되어 있기 때문에 비교적 느리다
		//- 사용자가 동시다발적으로 접근할 수 있는 환경에서 추천(웹)
		
		StringBuilder builder = new StringBuilder();
		long start = System.currentTimeMillis();
		
		for(int i=0;i<1000000;i++) {
			builder.append("*");
		}
		
		long finish = System.currentTimeMillis();
		System.out.println(finish-start);
		
		//System.out.println(builder.toString());
				
	}
}
