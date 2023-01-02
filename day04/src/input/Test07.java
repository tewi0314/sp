package input;
import java.lang.*;
import java.util.Scanner;
public class Test07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요: ");
		String name = in.next();
		System.out.println("인원수를 입력하세요: ");
		int num = in.nextInt();
		System.out.println("여행 일 수를 입력하세요: ");
		int period = in.nextInt();
		System.out.println("여행갈 년도와 월을 입력하세요: ");
		int year = in.nextInt();
		int month = in.nextInt();
		
		double seaDiscount = 0;
		int yoonDiscount = 0;
		
		double totalFee = 0;
		double disFee = 0;
		double finalFee = 0;
		
	
		if(year%400==0 || year%100!=0 && year%4==0) {
			yoonDiscount = 5;
		}
		
		if(month>=3 && month<=5) {
			seaDiscount = 10;
		}else if(month>=6 && month<=8) {
			seaDiscount = 5;
		}else if(month>=9 && month<=11) {
			seaDiscount = 30;
		}else if(month>=12 || month<=2) {
			seaDiscount = 20;
		}
		
		totalFee = num * period * 100000;
		disFee = totalFee * ((seaDiscount+yoonDiscount)/100) ;
		finalFee = totalFee - disFee;
		
		System.out.println(name + "님의 여행 견적서는 다음과 같습니다.");
		System.out.println();
		System.out.println("여행 예정 : " + year + "년 " + month + "월");
		System.out.println("여행 인원수: " + num + "명");
		System.out.println("여행 기간 : " + period);
		System.out.println("계절 할인 : " + seaDiscount + "%");
		if(yoonDiscount!=0) System.out.println("운년 할인 : " + yoonDiscount + "%");
		System.out.println();
		System.out.println("총 금액: " + (int)totalFee + "원");
		System.out.println("할인 금액: " + (int)disFee + "원");
		System.out.println("견적 금액: " + (int)finalFee + "원");
		System.out.println();
		System.out.println("<버튼을 눌러 예약 사이트로 이동해주세요>");
		
		
		
	}
}
