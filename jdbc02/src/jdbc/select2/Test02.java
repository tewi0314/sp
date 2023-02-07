package jdbc.select2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc.select.PocketmonDto;
import jdbc.util.JdbcUtils;

public class Test02 {
	public static void main(String[] args) {
		//검색
		//(ex) 이름의 일부분만 입력하면 유사한 항목을 조합하여 출력
		
		//데이터준비
		String type = "name"; // 검색 분류(정적 바인딩)
		String keyword = "츄"; // 검색 키워드(동적 바인딩)
		
		//JDBC
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		String sql = "select * from pocketmon where instr(#1, ?)>0";
		sql = sql.replace("#1", type);
		Object[] param = {keyword};
		
		RowMapper<PocketmonDto> mapper = new RowMapper<PocketmonDto>() {

			@Override
			public PocketmonDto mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				PocketmonDto dto = new PocketmonDto();
				dto.setNo(rs.getInt("no"));
				dto.setName(rs.getString("name"));
				dto.setType(rs.getString("type"));	
				return dto;
			}
			
		};
		
		
		List<PocketmonDto> list = jdbcTemplate.query(sql, mapper, param);
		
		System.out.println("검색결과: " + list.size());
		
		for(PocketmonDto dto : list) {
			System.out.println(dto.getName());
		}
	}
}
