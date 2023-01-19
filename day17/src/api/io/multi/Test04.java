package api.io.multi;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test04 {
	public static void main(String[] args) throws IOException {
		File file = new File("temp", "lotto.kh");
		FileInputStream stream = new FileInputStream(file);
		BufferedInputStream buffer = new BufferedInputStream(stream);
		DataInputStream combine = new DataInputStream(buffer);
		List<Integer> list = new ArrayList<>();
		try {
		while(true){
			list.add(combine.readInt());
		}
		}
		catch(Exception e){
			
		}
		
		combine.close();
		
		System.out.println(list);
		
		
	}
}
