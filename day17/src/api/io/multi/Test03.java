package api.io.multi;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Test03 {
	public static void main(String[] args) throws IOException {
		Random r = new Random();
		int[] arr = new int[6];
	
		for(int i=0;i<arr.length;i++) {
			arr[i] = r.nextInt(45)+1;
			for(int j=i-1;j>=0;j--) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		File file = new File("temp", "lotto.kh");
		FileOutputStream stream = new FileOutputStream(file);
		BufferedOutputStream buffer = new BufferedOutputStream(stream);
		DataOutputStream mixer = new DataOutputStream(buffer);
		
		for(int i=0;i<arr.length;i++) {
			mixer.writeInt(arr[i]);
		
		}
		mixer.close();
	}
}
