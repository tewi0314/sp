package jdbc.select;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc.util.JdbcUtils;

public class Test01 {
	public static void main(String[] args) {
		//Spring JDBC select
		//insert, update, delete처럼 구현하면 원하는 결과를 얻을 수 없다.
		//- 조회 결과(ResultSet)을 어떻게 담을 것인지를 정의해야 한다
		//- 조회 결과를 담기 위한 객체생성용 클래스가 필요(DTO, Data Transfer Object)
		
		//데이터 준비 (없음)
		//JDBC
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		String sql ="select * from pocketmon";
		
		//변환 방법을 정의하는 객체를 생성(RowMapper)
		//- mapRow 메소드에 제공되는 ResultSet을 PocketmonDto로 이동하도록 구현
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
		
		//조회를 위한 별도의 명령을 사용
		List<PocketmonDto> list = jdbcTemplate.query(sql,mapper);
		System.out.println(list.size());
		
		for(PocketmonDto dto : list) {
			System.out.println(dto.getNo());
			System.out.println(dto.getName());
			System.out.println(dto.getType());
		}
		
		System.out.println();
		
		
		
	}
}
