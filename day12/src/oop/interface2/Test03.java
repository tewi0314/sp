package oop.interface2;

public class Test03 {
	public static void main(String[] args) {
		//Calculator를 사용한 연산
		Calculator c = new Calculator(){

			@Override
			public int process(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
			
		};
		
		System.out.println(c.process(10,20));
	}
}
