package jdbc.select2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc.select.StudentDto;
import jdbc.util.JdbcUtils;
public class Test05 {
	public static void main(String[] args) {
		
		String type = "name";
		String keyword = "준";
		Object[] param = {keyword};
		String sql = "select * from student where instr(#1, ?) > 0";
		sql = sql.replace("#1", type);
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		RowMapper<StudentDto> mapper = new RowMapper<StudentDto>() {
			
			@Override
			public StudentDto mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				StudentDto dto = new StudentDto();
				dto.setEnglish(rs.getInt("english"));
				dto.setMath(rs.getInt("math"));
				dto.setKorean(rs.getInt("korean"));
				dto.setName(rs.getString("name"));
				dto.setNo(rs.getInt("no"));
				return dto;
			}
			
			
			
		};
		List<StudentDto> list = jdbcTemplate.query(sql, mapper, param);
		
		for(StudentDto dto : list) {
			System.out.println(dto.getNo());
			System.out.println(dto.getName());
			System.out.println(dto.getMath());
		}
		
	}
}
