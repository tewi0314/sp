package api.util.random;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		//OTP(One Time Password)를 만들려면?
		//- 랜덤이긴 하지만 예측 가능해야한다
		//- 예측이 가능하려면 시드가 일정시간 동안 같아야 한다
		//- 어떻게 하면 60초마다 바뀌는 값을 만들 수 있을까?
		//- 시간과 나눗셈을 통해 계산한다
		//- 서로 다른 회원은 서로 다른 otp 번호가 나와야한다
		//- 
		Random r = new Random();
		Format f = new DecimalFormat("000000");
		
		String a = "admin";
		String b = "student";
		
		long time = System.currentTimeMillis() / 1000L;
		//System.out.println("time = " + time);
		long seedA = time + a.hashCode();
		long seedB = time + b.hashCode();
		r.setSeed(time);
		
		//int otp = 00000~99999;
		int otp = r.nextInt(1000000) + 0;
		
		System.out.println("otp = " + f.format(otp));
	}
}
