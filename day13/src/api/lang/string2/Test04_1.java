package api.lang.string2;

public class Test04_1 {
	public static void main(String[] args) {
		//문자열에 보이스피싱 관련 단어가 포함되어있는지 감지하는 프로그램
		//- 검찰, 송금, 계좌, 돈, 납치, 아들
		String text = "안녕하세요";
		
		String[] filter = new String[] {
				"검찰", "송금", "계좌", "돈", "납치", "아들", "딸"
		};
		
		//filter를 이용해서 정규표현식을 생성
		StringBuffer buffer = new StringBuffer();
		buffer.append(".*?(");
		for(int i=0;i<filter.length;i++) {
			buffer.append(filter[i]);
			buffer.append("|");
		}
		buffer.deleteCharAt(buffer.length()-1);
		buffer.append(").*?");
		System.out.println(buffer.toString());
		String regex =buffer.toString();
		
		if(text.matches(regex)) {
			System.out.println(text);
			System.out.println("-------------");
			System.out.println("주의: 보이스피싱에 주의하세요");
		}else {
			System.out.println(text);
		}
	}
}
