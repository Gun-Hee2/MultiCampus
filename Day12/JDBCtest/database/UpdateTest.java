package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
	public UpdateTest(){ 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("Driver Loading Success!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() { // DB와 연결해주는 클래스
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "HR");
			
			System.out.println("DB Connection Success!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public int update(String name, int age) {
		String sql = "UPDATE UserDto SET name = '홍두께', age = 22 WHERE name = '홍길동'";
				   
		
		Connection conn = getConnection();
		Statement stmt = null;
		
		int count = 0;
		
		try {
			stmt = conn.createStatement();
			
			count = stmt.executeUpdate(sql); // 퀴리문을 실행
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null) {
					stmt.close();

				}
				if(stmt != null) {
					conn.close();

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return count;
		
	}

}
