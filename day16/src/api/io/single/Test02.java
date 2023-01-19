package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException, InterruptedException {
		//목표: 싱글 바이트 단위 데이터 입력(열기)
		//준비물: 파일 객체(없으면 에러), 스트림객체(입력용)
		File target = new File("temp", "single.kh");
		
		FileInputStream stream = new FileInputStream(target);
		//구조: 프로그램 <- stream <- target <- single.kh
		
		//[1] for를 이용하여 파일크기만큼 반복
		//-사용하지않음(나중에는 여러 글자를 불러오므로 횟수 계산이 어려움)
//		for(int i=0;i<target.length();i++) {
//			int n = stream.read();
//			System.out.println("n= " + n);
//		}
		
		//[2] while을 이용해서 반복하여 읽기
		//EOF(End of File) 값인 -1이 나올때까지 입력
		while(true) {
			int n = stream.read();
			System.out.println("n= " + n);
			if(n==-1) break;
			Thread.sleep(500);
		}
		
	}
}
