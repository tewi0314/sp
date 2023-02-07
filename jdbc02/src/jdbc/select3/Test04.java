package jdbc.select3;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import jdbc.util.JdbcUtils;
import jdbc.select.*;
public class Test04 {
	public static void main(String[] args) {
		
		int n = 7;
	
		Object[] param = {n};
		String sql = "select * from subject where no = ?";
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		ResultSetExtractor<SubjectDto> extractor = new ResultSetExtractor<SubjectDto>() {

			@Override
			public SubjectDto extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if(rs.next()) {
					SubjectDto dto = new SubjectDto();
					dto.setNo(rs.getInt("no"));
					dto.setName(rs.getString("name"));
					dto.setPeriod(rs.getInt("period"));
					dto.setPrice(rs.getInt("price"));
					dto.setType(rs.getString("Type"));
					return dto;
				}else {
					return null;
				}
			}
			
		};
		
		SubjectDto dto = jdbcTemplate.query(sql, extractor, param);
		
		if(dto == null) {
			return;
		}else {
			
		
		System.out.println(dto.getName());
		System.out.println(dto.getNo());
		}
	}
}
