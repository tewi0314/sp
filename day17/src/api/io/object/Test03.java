package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] ags) throws IOException {
		List<String> list = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		while(true) {
			String s = in.next();
			if(s.equals("종료")) {
				break;
			}
			list.add(s);
		}
		
		File file = new File("temp", "input.kh");
		FileOutputStream stream = new FileOutputStream(file);
		BufferedOutputStream buffer = new BufferedOutputStream(stream);
		ObjectOutputStream mixer = new ObjectOutputStream(buffer);
		
		mixer.writeObject(list);
		mixer.close();
		System.out.println("저장완료");
	}
}
