package api.lang.string;

public class Test11 {
	public static void main(String[] args) {
		//목표:비밀번호 검사식 만들기
		//-반드시 1개이상 포함
		
		String password = "12345678a#A";
		int lower = 0, upper = 0, number = 0, special = 0;
		
		for(int i=0;i<password.length();i++) {
			char ch = password.charAt(i);
			//System.out.println(ch);
			if(ch>='A' && ch <='Z') {
				upper++;
			}else if(ch>='a' && ch<='z') {
				lower++;
			}else if(ch>='0' && ch<='9') {
				number++;
			}else if(ch == '!' || ch == '@') {
				special++;
			}
		}
		
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z!@#$0-9]{8,16}$";
		boolean must = lower>0 && upper>0 && number>0 && special>0;
		
		if(password.matches(regex)) {
			System.out.println("올바른 패스워드입니다.");
		}else {
			System.out.println("잘못된 패스워드입니다.");
		}
		
	}
}
