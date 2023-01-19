package api.io.file;

import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		//파일제어
		//- java 에서는 파일 및 디렉터리를 모드 File클래스로 제어한다
		
		File a = new File("temp/hello.txt");
		File b = new File("temp", "hello.txt");
		
		System.out.println("성공");
		
		System.out.println(a.exists()); //존재하는가?
		System.out.println(b.exists());
		
		System.out.println(a.isFile()); //파일인가?
		System.out.println(a.isDirectory()); //디렉토리인가?
		
		System.out.println(a.length()); // 파일 크기(=들어있는 글자 수)
		
		System.out.println(a.getName()); //파일 명
		System.out.println(a.getPath()); //파일위치(상대 경로)
		System.out.println(a.getAbsolutePath()); //파일위치(절대 경로)
		
		//상대경로와 절대경로
		//- 상대경로는 특정 지점을 기준으로 계산한 경로(ex 우리 옆집)
		// 		./ 는 현재 경로를 의미하며 생략 가능하다.
		//		../는 현재 경로보다 상위 경로를 의미한다. 생략이 불가능
		//- 절대경로는 모든 상황에서 동일한 경로(ex 서울시 영등포구 선유로길 59)
		
		System.out.println(a.canRead());
		System.out.println(a.canWrite());
		System.out.println(a.isHidden());
		
		System.out.println(a.lastModified()); //마지막 수정시각
		
		Date d = new Date(a.lastModified());
		Format f = new SimpleDateFormat("y년 M월 d일 H시 m분 s초");
		
		System.out.println(f.format(d));
		
 	}
}
