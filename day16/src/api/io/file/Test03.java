package api.io.file;

import java.io.File;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		in.close();
		File file = new File(s);
		
		
		if(file.isFile()) {
			System.out.println(file.getName() + " " + file.length());
		}else if(file.isDirectory()) {
			File[] files = file.listFiles();
			for(File a : files) {
				if(!a.isFile())
				System.out.println(a.getName() +  " 폴더");
				else {
				System.out.println(a.getName() + " 파일");
			}
		}
		
	}else if(!file.exists()) {
		System.err.println("대상이 존재하지 않습니다.");
	}
		
}
}
