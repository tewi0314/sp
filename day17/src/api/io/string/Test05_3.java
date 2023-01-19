package api.io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test05_3 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		File dir = new File("temp");
		
		String s;		
		StringBuffer buffer = new StringBuffer();
		
		while(true) {
			s = in.next();
			if(s.equals("종료")) {
				System.out.println("종료합니다.");
				break;
			}
			buffer.append(s);
			buffer.append("\n");
		}
		
		File file = new File("temp", "kaka.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.write(buffer.toString());
		
		in.close();
		pw.close();
	}
}
