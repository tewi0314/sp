package api.io.file;

import java.io.File;

public class Test02 {
	public static void main(String[] args) {
		//디렉토리 분석
		//-자바는 파일과 디렉터리의 생성방법이 같다(사용법은 다름)
		
		File dir = new File("temp");
		
		if(!dir.isDirectory()) {
			System.err.println("디렉터리가 아니네요");
			System.exit(-1);
		}
		
		//디렉터리는 크기가 없다(내용물의 크기만 있을 뿐)
		System.out.println(dir.length());
		
		//디렉터리에서 의미가 있는 건 뭘까?
		//- 안에 무엇이 있느냐가 중요한 포인트이며 이와 관련된 명령어가 존재
		//- .listFiles()를 사용하여 내부에 들어있는 파일 목록을 반환
		
		File[] files = dir.listFiles();
		System.out.println("파일 개수: " + files.length);
		
		for(File file : files) {
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
		}
	}
}
