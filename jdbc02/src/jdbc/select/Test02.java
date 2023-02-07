package jdbc.select;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc.util.JdbcUtils;

public class Test02 {
	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		String sql = "select * from product where price>=2000 order by price asc";
		
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
		
		List<ProductDto> list = jdbcTemplate.query(sql, mapper);
		for(ProductDto dto : list) {
			System.out.println(dto.getNo());
			System.out.println(dto.getName());
			
			System.out.println(dto.getType());
			System.out.println(dto.getPrice());
			
			System.out.println(dto.getMade());
			System.out.println(dto.getExpire());
			
		}
	}
}
