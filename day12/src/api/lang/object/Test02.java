package api.lang.object;

import java.util.Random;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//Object가 진짜 최상위 클래스인지 확인해보자
		//->Object를 보관용도로 사용하면 "아무거나"라는 뜻과 같다
		
		Object a = true;
		Object b = 10;
		Object c = 3.14;
		Object d = "hello";
		Object in = new Scanner(System.in);
		Object r = new Random();
		//Object s = new Student();
		
		//아무거나 10개만 저장할 수 있는 배열
		Object[] arr = new Object[10];
		Student s1 = (Student)arr[0];
	}
}
