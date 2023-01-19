package api.io.file;

import java.io.File;

public class Test04 {
	public static void main(String[] args) {
		//또다른 파일 생성 방법
		
///*//		File dir = new File("temp");
////		File target = new File(dir, "hello.txt");
////		
			File target = new File("temp");
			//target = target.getAbsoluteFile(); //절대경로로 변환
			target = new File(target, "hello.txt"); //특정 대상으로 이동
			System.out.println(target);
			target = target.getParentFile(); //상위 폴더로 이동
			target = target.getParentFile(); //상위 폴더로 이동
			System.out.println(target);
	}
}
