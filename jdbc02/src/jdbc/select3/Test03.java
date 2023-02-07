package jdbc.select3;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc.select.StudentDto;
import jdbc.util.JdbcUtils;

public class Test03 {
	public static void main(String[] args) {
		
		int n = 2;
		Object[] param = {n};
		String sql = "select * from student where no = ?";
		
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
		
		if(list.isEmpty()) {
			System.out.println("일치하는 자료가 없습니다.");
		}else {
			StudentDto dto = list.get(0);
			System.out.println(dto.getNo());
			System.out.println(dto.getName());
			System.out.println(dto.getEnglish());
		}
	}
}
