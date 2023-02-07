package jdbc.test;

import java.util.List;

import jdbc.dao.PocketmonDao;
import jdbc.dto.PocketmonDto;

public class Test05 {
	public static void main(String[] args) {
		//pocketmon 검색
		
		//데이터 준비
		String column = "name";
		String keyword = "몬켓포";
		
		//JDBC
		PocketmonDao dao = new PocketmonDao();
		List<PocketmonDto> list = dao.selectList(column, keyword);
		
		if(list.isEmpty()) {
			System.out.println("데이터가 없어요");
		}else {
			System.out.println("데이터 크기: " + list.size());
			for(PocketmonDto dto : list) {
				System.out.println(dto);
			}
		}
	}
}
