package oop.test1;

public class Test01 {
	public static void main(String[] args) {
		
		Message m1 = new Message();
		m1.writer = "초롱초롱 라이언";
		m1.content = "언제와?";
		
		System.out.println(m1.writer);
		System.out.println(m1.content);
		System.out.println(m1.remain);
		System.out.println(m1.time);
	}

}
