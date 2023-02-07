package jdbc.select2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc.select.ProductDto;
import jdbc.util.JdbcUtils;
public class Test03 {
	public static void main(String[] args) {
		
		String type = "name";
		String type2 = "no";
		String keyword = "멘";
		String keyword2 = "2";
		String sql = "select * from product where instr(#1, ?)>0 or instr(#2, ?)>0";
		sql = sql.replace("#1", type);
		sql = sql.replace("#2", type2);
		Object[] param = {keyword, keyword2}; 
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		RowMapper<ProductDto> mapper = new RowMapper<ProductDto>() {

			@Override
			public ProductDto mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				ProductDto dto = new ProductDto();
				dto.setNo(rs.getInt("no"));
				dto.setName(rs.getString("name"));
				dto.setType(rs.getString("type"));
				dto.setPrice(rs.getInt("price"));
				dto.setMade(rs.getString("made"));
				dto.setExpire(rs.getString("expire"));
				
				return dto;
			}
			
		};
		
		List<ProductDto> list = jdbcTemplate.query(sql, mapper, param);
		
		if(list.isEmpty()) {
			System.out.println("검색결과가 존재하지 않습니다.");
		}else {
		
		for(ProductDto dto : list) {
			System.out.println(dto.getName());
			System.out.println(dto.getNo());
		}
		}
		
		System.out.println(sql);
	}
}
