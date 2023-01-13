package api.lang.string2;

public class Test02 {
	public static void main(String[] args) {
		//StringBuffer 사용
		
		StringBuffer buffer = new StringBuffer();
		
		long start = System.currentTimeMillis();
		
		for(int i=0;i<1000000;i++) {
			buffer.append("*");
		}
		
		long finish = System.currentTimeMillis();
		System.out.println(finish-start);
		
		//System.out.println(buffer.toString());
				
	}
}
