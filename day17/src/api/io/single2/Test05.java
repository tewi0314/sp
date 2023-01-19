package api.io.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.Format;

public class Test05 {
	public static void main(String[] args) throws IOException {
		//- 버퍼(buffer)를 사용한 대량 복사
		//- 컴퓨터는 2진수를 쓰므로 2진수로 만들 수 있는 숫자가 최적의 성능을 발휘
		//- 일반적으로 1024,2048,4096,8192
		//- 자바 표준은 8192
		File origin = new File("D:/origin.zip");
		File target = new File("D:/copy.zip");
		
		FileInputStream in = new FileInputStream(origin);
		FileOutputStream out = new FileOutputStream(target);
		
		byte[] buffer = new byte[8192];
		
		long total = origin.length();
		long count = 0L;
		
		Format f = new DecimalFormat("#,##0.00");
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int size = in.read(buffer);
			if(size == -1) break;
			out.write(buffer, 0 , size);
			count += size;
			double percent = count*100.0/total;
			System.out.println("(" + count + "/" + total + ") =" + f.format(percent));
		
		}
		
		long finish = System.currentTimeMillis();
		System.out.println("시간: " + (finish-start));
		in.close();
		out.close();
	}
}
