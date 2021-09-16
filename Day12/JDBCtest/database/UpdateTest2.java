package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import db.DBClose;
import db.DBConnection;

public class UpdateTest2 {
	public int update(String name, int age, String id) {
		String sql = " UPDATE USERDTO "
				   + " SET NAME = ?, AGE = ? "
				   + " WHERE ID = ? ";
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement stmt = null;
		
		int count = 0;
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, name);
			stmt.setInt(2, age);
			stmt.setString(3, id);
			
			count = stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBClose.close(conn, stmt, null);
		}
		
		return count;
		
		
	}

}
