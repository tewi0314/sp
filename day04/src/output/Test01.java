package output;

public class Test01 {
	public static void main(String[] args) {
		//표준 출력(standard output)
		//- 표준 출력 통로(System.out)을 통해 데이터를 내보내는 행위
		//- System.out.println() - 내용을 1줄 단위로 출력하는 명령
		//- System.out.print() - C언어 방식의 출력 명령
		
		System.out.println("hello");
		System.out.println("goodbye");
		
		System.out.print("hello\n");
		System.out.print("goodbye\n");
		
		System.out.printf("hello\n");
		System.out.printf("%d + %d = %d\n", 10, 20, 30);
	}
}
