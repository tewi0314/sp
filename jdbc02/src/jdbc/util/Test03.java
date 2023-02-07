package jdbc.util;

import org.springframework.jdbc.core.JdbcTemplate;

public class Test03 {
	public static void main(String[] args) {
		
		int no = 8;
		String name = "자바";
		int period = 150;
		int price = 10;
		String type = "혼합";
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		String sql = "update subject set name=?, period=?, price=?, type=? where no = ?";
		Object[] param = {name, period, price, type, no};
		
		int count = jdbcTemplate.update(sql,param);
		
		if(count>0) {
			System.out.println("정상 수정");
		}else {
			System.out.println("수정할 데이터가 없습니다.");
		}
	}
}
