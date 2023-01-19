package api.io.single;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		//목표: 싱글 바이트 단위 데이터 출력(<->저장)
		//준비물: 파일 객체(없으면 생김), 스트림 객체(출력용 스트림)
		
		//도구 준비
		File target = new File("temp", "single.kh");
		FileOutputStream stream = new FileOutputStream(target);
		
		//구조: 프로그램 -> stream -> target -> single.kh
		stream.write(104);
		stream.write(101);
		stream.write(108);
		stream.write(108);
		stream.write(111);
		stream.write(32);
		stream.write('j');
		stream.write('a');
		stream.write('v');
		stream.write('a');
		stream.write('\n');
		stream.write('a');
		stream.write(30000); // '0'(48) 로 변환되어 출력
		
		byte[] b = new byte[] {'H','W','L','L','O'};
		stream.write(b);
		stream.write(b,0,4);
		
		//입출력 통로는 반드시 close() 필요
		stream.close();
	}
}
