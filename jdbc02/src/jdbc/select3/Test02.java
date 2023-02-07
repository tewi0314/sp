package jdbc.select3;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc.select.SubjectDto;
import jdbc.util.JdbcUtils;

public class Test02 {
	public static void main(String[] args) {
		int no = 7;
		
		String sql = "select * from subject where no = ?";
		Object[] param = {no};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		RowMapper<SubjectDto> mapper = new RowMapper<SubjectDto>() {

			@Override
			public SubjectDto mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				SubjectDto dto = new SubjectDto();
				dto.setNo(rs.getInt("no"));
				dto.setName(rs.getString("name"));
				dto.setPeriod(rs.getInt("period"));
				dto.setPrice(rs.getInt("price"));
				dto.setType(rs.getString("Type"));
				return dto;
			}
		};
		
		List<SubjectDto> list = jdbcTemplate.query(sql, mapper, param);
		
		if(list.isEmpty()) {
			System.out.println("검색조건과 일치하는 자료가 없습니다.");
		}else {
			SubjectDto dto = list.get(0);
			System.out.println(dto.getNo());
			System.out.println(dto.getName());
			System.out.println(dto.getPeriod());
		}
	}
}
