package oop.abstrac;

public class Test02 {
	public static void main(String[] args) {
		// 좌/우가 일치하도록 생성한 코드(정적 타입 생성 구문)
		IPhone13 a = new IPhone13("black");
		IPhone14 b = new IPhone14("white");
		Galaxy22s c = new Galaxy22s("green");
		GalaxyFold4 d = new GalaxyFold4("brown");
		
		// 좌/우가 일치하지 않도록 생성한 코드(동적 타입 생성 구문)
		Mobile m1 = new IPhone13("black");
	}
}
