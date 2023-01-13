package api.lang.string;

public class Test13 {
	public static void main(String[] args) {
		//목표: 기본자료형(원시형)과 문자열 사이의 변환
		
		//-100을 "100"으로 만들 수 있는가? 반대는 가능한가?
		//- 통신(입출력)에서는 int나 double같은 데이터는 전송이 불가능
		//- 네트워크에서는 기본 전송단위가 패킷(packet)인데 크기가 1byte
		//- 문자열로 변한하여 전송하고 수신하는 경우가 비일비재
		
		int a = 100;
		String b = ""+a;//편법 : 문자열+데이터 = 문자열
		
	}
}
