package jdbc.test;

import jdbc.dao.PocketmonDao;

public class Test03 {
	public static void main(String[] args) {
		int n = 31;
		
		PocketmonDao dao = new PocketmonDao();
		boolean result = dao.delete(n);
		
		if(result) {
			System.out.println("삭제완료");
		}else {
			System.out.println("대상없음");
		}
	}
}
