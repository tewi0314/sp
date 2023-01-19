package api.io.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.Format;

public class Test01 {
	public static void main(String[] args) throws IOException{
		File target = new File("D:/1212.txt");
		File copy = new File("D:/", "2323.txt");
		FileInputStream stream1 = new FileInputStream(target);
		FileOutputStream stream2 = new FileOutputStream(copy);
		
//		while(true) {
//			int n = stream1.read();
//			if(n==-1) break;
//			stream2.write(n);	
//		}
		
//		stream1 = new FileInputStream(copy);
//		
//		while(true) {
//			int n = stream1.read();
//			if(n==-1) break;
//			System.out.println(n);
//		}
		
		stream1 = new FileInputStream(target);

		
		long total = target.length();
		long count = 0L;
		
		Format f = new DecimalFormat("#,##0");
		
		while(true) {
			int n = stream1.read();
			if(n==-1) break;
			
			stream2.write(n);
			count++;
			double percent = count*100.0/total;
			System.out.println("(" + count + "/" + total + ") =" + f.format(percent));
		}
		
	}
}
