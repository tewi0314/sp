package jdbc.test;

import jdbc.dao.PocketmonDao;
import jdbc.dto.PocketmonDto;

public class Test07 {
	public static void main(String[] args) {
		//포켓몬 상세 조회, 단일 조회
		
		int no = 0;
		PocketmonDao dao = new PocketmonDao();
		PocketmonDto dto = dao.selectOne(no);
		
		if(dto!=null) {
			System.out.println(dto);
		}else {
			System.out.println("찾으시는 몬스터의 정보가 없어요.");
		}
	}
}
