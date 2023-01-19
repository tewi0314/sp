package api.io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		String s, s1;
		System.out.print("경로입력: ");
		s = in.next();
		System.out.print("파일명 입력: ");
		s1 = in.next();
		
		File file = new File(s, s1);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			s = br.readLine();
			if(s==null) break;
			System.out.println(s);
		}
		br.close();
		in.close();
	}
}
