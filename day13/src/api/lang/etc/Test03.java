package api.lang.etc;

import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		//Runtime 클래스
		//- 생성자 없음(미리 생성해두었거나 대행해주는 경우)
		//- 생성이든 랜탈이든 부탁을 해서 얻어와야 하는 상황
		//- 만들 때 반드시 지켜야 하는 규칙이 있는 경우
		//- 반드시 생성 메소드가 static으로 존재한다(get... 으로 되어 있음)
		
		//Runtime r = new Runtime(); //직접생성 불가
		Runtime r = Runtime.getRuntime(); //생성의뢰 가능
		
		String os =System.getProperty("os.name");
		if(os.startsWith("Windows")) {
			try {
				r.exec("notepad");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(os.startsWith("Mac")) {
			try {
				r.exec("open -a TextEdit.app");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
