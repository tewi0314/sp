package jdbc.test;

import jdbc.dao.PocketmonDao;
import jdbc.dto.PocketmonDto;

public class Test02 {
	public static void main(String[] args) {
		//pocketmon 수정
		
		//데이터 준비
		PocketmonDto dto = new PocketmonDto();
		dto.setNo(10);
		dto.setName("몬켓포");
		dto.setType("입타");
		
		PocketmonDao dao = new PocketmonDao();
		boolean result = dao.update(dto);
		
		if(result) {
			System.out.println("변경완료");
		}else {
			System.out.println("대상 없음");
		}
	}
}
