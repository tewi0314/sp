package input;
import java.util.Scanner;
public class Test05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("국어 점수 입력: ");
		int kor = in.nextInt();
		System.out.print("수학 점수 입력: ");
		int math = in.nextInt();
		System.out.print("영어 점수 입력: ");
		int eng = in.nextInt();
		in.close();
		int sum = kor + math + eng;
		double avg = sum/3.0;
		
		System.out.println("총접은 " + sum + " 이고 평균은 " + avg +" 점 입니다.");
		if(kor>=40 && math>=40 && eng>=40 && avg>=60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
	}
}
