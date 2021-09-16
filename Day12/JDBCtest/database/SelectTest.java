package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DBClose;
import db.DBConnection;
import dto.UserDto;

public class SelectTest {
	
	// 하나의 데이터만을 취득
	public UserDto search(String id) {
		String sql = " SELECT ID, NAME, AGE, JOINDATE "
				   + " FROM USERDTO "
				   + " WHERE ID = '" + id + "' ";
		
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null; //select한 데이터를 받아줌
		
		UserDto dto = null;
		
		try {
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql); //select절은 executeQuery를 사용
			
			if(rs.next() == true) { // true일때 DB로부터 넘어 온 데이터가 있음
				
				String _id = rs.getString("ID");
				String _name = rs.getString("NAME");
				int _age = rs.getInt("AGE");
				String _date = rs.getString("JOINDATE");
				
				dto = new UserDto(_id, _name, _age, _date);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(conn, stmt, rs);
		}
		
		return dto;
	}
	
	public UserDto search2(String id) {
		
		String sql = " SELECT ID, NAME, AGE, JOINDATE "
				   + " FROM USERDTO "
				   + " WHERE ID = ? ";
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement psmt = null;
		ResultSet rs = null; //select한 데이터를 받아줌
		
		UserDto dto = null;
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			
			rs = psmt.executeQuery(); 
			
            if(rs.next() == true) { // true일때 DB로부터 넘어 온 데이터가 있음
				
				String _id = rs.getString("ID");
				String _name = rs.getString("NAME");
				int _age = rs.getInt("AGE");
				String _date = rs.getString("JOINDATE");
				
				dto = new UserDto(_id, _name, _age, _date);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(conn, psmt, rs);
		}
		
		return dto;
		
	}
	
	// 다수의 데이터를 취득
	
	public List<UserDto> getUsers(){
		
		String sql = " SELECT ID, NAME, AGE, JOINDATE "
				   + " FROM USERDTO ";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null; //select한 데이터를 받아줌	
		
		List<UserDto> list = new ArrayList<UserDto>();
		
		try {
			conn = DBConnection.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next() == true) { //다수의 데이터를 가져올때는 while문을 사용
				
				String _id = rs.getString("ID");
				String _name = rs.getString("NAME");
				int _age = rs.getInt("AGE");
				String _joindate = rs.getString("JOINDATE");
				
				UserDto dto = new UserDto(_id, _name, _age, _joindate);
				list.add(dto);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, psmt, rs);
		}
		return list;
		
	}
	

}
