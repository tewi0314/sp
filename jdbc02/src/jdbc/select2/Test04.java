package jdbc.select2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc.select.SubjectDto;
import jdbc.util.JdbcUtils;

public class Test04 {
	public static void main(String[] args) {
		
		String type = "name";
		String keyword = "웹";
		Object[] param = {keyword};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		String sql = "select * from subject where instr(#1, ?)>0";
		sql = sql.replace("#1", type);		
		
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
		
		for(SubjectDto dto : list) {
			System.out.println(dto.getName());
			System.out.println(dto.getType());
		}
		
	}
}
