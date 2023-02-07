package jdbc.delete;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcUtils;

public class Test02 {
	public static void main(String[] args) {
		
		int rank = 10;
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		String sql = "delete worldcup where rank = ?";
		Object[] param = {rank};
		int count = jdbcTemplate.update(sql, param);
		
		if(count>0) {
			System.out.println("수정 완료");
		}else {
			System.out.println("데이터가 없습니다.");
		}
		
	}
}
