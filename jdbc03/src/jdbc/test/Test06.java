package jdbc.test;

import java.util.List;

import jdbc.dao.PocketmonDao;
import jdbc.dto.PocketmonDto;

public class Test06 {
	public static void main(String[] args) {
		//pocketmon 목록/검색 통합
		
		//데이터 준비
		String column = null;
		String keyword = "몬켓포";
		
		//JDBC
		PocketmonDao dao = new PocketmonDao();
		//List<PocketmonDto> list = 목록 or 검색;
		List<PocketmonDto> list;
		if(column != null && keyword != null) {
			list = dao.selectList(column, keyword);
		}else {
			list = dao.selectList();
		}
		
		if(list.isEmpty()) {
			System.out.println("데이터가 없습니다");
		}else {
			for(PocketmonDto dto : list) {
				System.out.println(dto);
			}
		}
	}
}
