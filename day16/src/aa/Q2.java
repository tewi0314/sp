package aa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Q2 {

	private Connection con;
	private Statement stmt;

	public Q2() {
		try {
			String url = "jdbc:mysql://localhost/?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "user";
			String passwd = "1234";

			con = DriverManager.getConnection(url, user, passwd);
			System.out.println("DB연결 성공");

			stmt = con.createStatement();
			System.out.println("Statement객체 생성 성공");

			stmt.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("DB연결 실패");
			System.out.print("사유 : " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		new Q2();
	}

}