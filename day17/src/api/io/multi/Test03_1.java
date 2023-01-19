package api.io.multi;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test03_1 {
	public static void main(String[] args) throws IOException{
		Set<Integer> set = new TreeSet<>();
		Random r = new Random();
		
		while(set.size()!=6) {
			set.add(r.nextInt(45)+1);
		}
		
		System.out.println(set);
		
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=45;i++) {
			list.add(i);
		}
		
		Collections.shuffle(list);
		
		List<Integer> numbers = list.subList(0, 6);
		
		System.out.println(numbers);
		
		//파일 출력
		File dir = new File("temp");
		dir.mkdirs();//디렉토리 생성
		File target = new File(dir, "lotto.kh");
		
		FileOutputStream stream = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(stream);
		DataOutputStream mixer = new DataOutputStream(buffer);
	
		
		for(int number : numbers) {
			mixer.writeInt(number);
		}
		
		mixer.close();
		
		System.out.println("저장완료");
	}
}
