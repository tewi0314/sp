package jdbc.test;

import java.util.List;

import jdbc.dao.PocketmonDao;
import jdbc.dto.PocketmonDto;

public class Test04 {
	public static void main(String[] args) {
		//pocketmon 조회
		PocketmonDao dao = new PocketmonDao();
		List<PocketmonDto> list = dao.selectList();
		
		if(list.isEmpty()) {
			System.out.println("데이터가 없어요");
		}else {
			System.out.println("데이터 개수: " + list.size());
			for(PocketmonDto dto : list) {
				System.out.println(dto);
			}
		}
	}
}
