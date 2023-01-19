package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Test04 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		File file = new File("temp", "input.kh");
		FileInputStream stream = new FileInputStream(file);
		BufferedInputStream buffer = new BufferedInputStream(stream);
		ObjectInputStream combine = new ObjectInputStream(buffer);
		List<String> list = new ArrayList<>(); 
		list = (List)combine.readObject();
		
		System.out.println(list);
	}
}
