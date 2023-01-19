package temp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException{
		File target = new File("temp", "single.kh");
		File copy = new File("temp", "coph.kh");
		FileInputStream stream1 = new FileInputStream(target);
		FileOutputStream stream2 = new FileOutputStream(copy);
		
		while(true) {
			int n = stream1.read();
			if(n==-1) break;
			stream2.write(n);	
		}
		
		
	}
}
