package api.lang.object;

public class Test03 {
	public static void main(String[] args) {
		//객체비교
		//-객체에서 비교연산(==)은 동일한 객체인지를 묻는 것이다
		//- 특수한 경우가 아니라면 .equals()를 개조해서 사용하도록 권장한다
		
		Student a = new Student("피카츄", 60);
		Student b = new Student("피카츄", 60);
		Student c = new Student("피카츄", 80);
		Student d = new Student("꼬부기", 80);
		
		//(Q) a와 b는 같은 학생이에요?
		System.out.println(a==b); //a랑 b는 같나요? (동일)
		System.out.println(a.equals(b)); //a랑 b는 같나요? (동등)
	}
}
