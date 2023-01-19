package api.io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.print("파일명 입력: ");
		String s = in.next();
		
		File file = new File("temp", s);
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		while(true) {
			s = in.next();
			if(s.equals("종료")) {
				System.out.println("종료합니다.");
				break;
			}
			
			pw.println(s);
			
		}
		in.close();
		pw.close();
	}
}
