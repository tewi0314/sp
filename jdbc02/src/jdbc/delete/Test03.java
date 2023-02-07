package jdbc.delete;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcUtils;

public class Test03 {
	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		int no  = 5;
		String sql = "delete product where no = ?";
		Object[] param = {no};
		int count = jdbcTemplate.update(sql, param);
		
		if(count > 0) {
			System.out.println("수정 완료");
		}else {
			System.out.println("x");
		}
	}
}
