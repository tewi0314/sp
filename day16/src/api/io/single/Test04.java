package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test04 {
	public static void main(String[] args) throws IOException{
		//한 번에 여러개의 바이트를 입력받는 예제
		File target = new File("temp", "single.kh");
		FileInputStream stream = new FileInputStream(target);
		
		//여러 개의 바이트를 한 번에 입력받기위해 바이트 배열을 준비
		byte[] cart =new byte[5];
		
		//옮겨야하는 파일은 22byte이며, 카트는 5byte 이므로 
		//- 1회차 : (5/22)
		//- 2회차 : (10/22)
		//- 3회차 : (15/22)
		//- 4회차 : (20/22)
		//- 5회차 : (25/22)
		//- 6회차 : 읽을 것이 없음 ---> -1 반환(EOF)
		while(true) {
			int size = stream.read(cart); //읽은 내용을 cart에 담아라
			if(size == -1) break;
			System.out.println(size + ", " +Arrays.toString(cart));
		}
		
		stream.close();
	}
}
