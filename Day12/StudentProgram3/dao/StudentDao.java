package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import db.DBClose;
import db.DBConnection;
import dto.StudentDto;

public class StudentDao<UserDto> {
	Scanner sc = new Scanner(System.in);
	
	public StudentDao() {
		DBConnection.initConnection();
	}

	public void Create() {
		
		System.out.print("학생이름 = ");
		String name = sc.next();
		
		System.out.print("국어 = ");
		int kor = sc.nextInt();
		
		System.out.print("영어 = ");
		int eng = sc.nextInt();
		
		System.out.print("수학 = ");
		int math = sc.nextInt();
		
		//insert
		String sql = " INSERT INTO STUDENT(NUM, NAME, KOR, ENG, MATH) "
				   + " VALUES(STUSEQ.NEXTVAL, ?, ?, ?, ? ) ";
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement psmt = null;
		int count = 0;
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, name);
			psmt.setInt(2, kor);
			psmt.setInt(3, eng);
			psmt.setInt(4, math);
			
			count = psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(conn, psmt, null);
		}
		
		if(count > 0) {
			System.out.println("학생 정보가 추가 되었습니다.");
		}else {
			System.out.println("학생 정보가 추가 되지 않았습니다.");
		}
		
	}
	
	
	public void Delete() {	// 학생 정보 삭제
		System.out.print("삭제할 학생이름을 입력 >> ");
		String name = sc.next();
		
		Delstudent(name);
		
		
		
		
	}
	
	public void Read() {	// 학생 정보 검색
		
		List<StudentDto> list = getStudent();
		
		for(StudentDto student : list) {
			System.out.println(student.toString());
		}
		
		
	}
	
	public void Update() {	// 학생 정보 수정
		System.out.println("수정할 데이터를 입력해 주십시오");
		
		System.out.print("수정할 학생이름을 입력 >> ");
		String name = sc.next();
		
		System.out.print("국어 = ");
		int kor = sc.nextInt();
		
		System.out.print("영어 = ");
		int eng = sc.nextInt();
		
		System.out.print("수학 = ");
		int math = sc.nextInt();
		
		
		int count = update(name, kor, eng, math);
		if(count > 0) {
			System.out.println("정상적으로 수정되었습니다.");
		}
		
		
	}
	
	public void allprint() {
		
		List<StudentDto> list = getAllStudent();
		
		for(StudentDto student : list) {
			System.out.println(student.toString());
		}
		
	
	}
	
    public List<StudentDto> getStudent(){
    	System.out.print("검색할 학생이름을 입력 >> ");
		String name = sc.next();
    	
		String sql = " SELECT NUM, NAME, KOR, ENG, MATH "
				   + " FROM STUDENT "
				   + " WHERE NAME = ? ";
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement psmt = null;
		ResultSet rs = null; //select한 데이터를 받아줌
		
		List<StudentDto> list = new ArrayList<StudentDto>();
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			
			rs = psmt.executeQuery(); 
			
			while(rs.next() == true) { // true일때 DB로부터 넘어 온 데이터가 있음
				
				int _num = rs.getInt("NUM");
				String _name = rs.getString("NAME");
				int _kor = rs.getInt("KOR");
				int _eng = rs.getInt("ENG");
				int _math = rs.getInt("MATH");
				
				StudentDto dto = new StudentDto(_num, _name, _kor, _eng, _math);
				list.add(dto);
				
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(conn, psmt, rs);
	    }
		return list;
		
    }
    
    public List<StudentDto> getAllStudent(){
    	
		String sql = " SELECT * "
				   + " FROM STUDENT ";
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement psmt = null;
		ResultSet rs = null; //select한 데이터를 받아줌
		
		List<StudentDto> list = new ArrayList<StudentDto>();
		
		try {
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery(); 
			
			while(rs.next() == true) { // true일때 DB로부터 넘어 온 데이터가 있음
				
				int _num = rs.getInt("NUM");
				String _name = rs.getString("NAME");
				int _kor = rs.getInt("KOR");
				int _eng = rs.getInt("ENG");
				int _math = rs.getInt("MATH");
				
				StudentDto dto = new StudentDto(_num, _name, _kor, _eng, _math);
				list.add(dto);
				
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose.close(conn, psmt, rs);
	    }
		return list;
		
    }
    
	public int update(String name, int kor, int eng, int math) {
		
		System.out.println();
		
		String sql = " UPDATE STUDENT "
				   + " SET KOR = ?, ENG = ?, MATH = ? "
				   + " WHERE NAME = ? ";
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement psmt = null;
		
		int count = 0;
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setInt(1, kor);
			psmt.setInt(2, eng);
			psmt.setInt(3, math);
			psmt.setString(4, name);
			
			count = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBClose.close(conn, psmt, null);
		}
		
		return count;
		
		
	}
	
	public int Delstudent(String name){
		
        String sql = "DELETE FROM "
        		   + "STUDENT "
        		   + "WHERE NAME = ? ";
				   
		
        Connection conn = DBConnection.getConnection();
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		int count = 0;
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			rs = psmt.executeQuery();
		
			count = psmt.executeUpdate(); // 퀴리문을 실행
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(psmt != null) {
					psmt.close();

				}
				if(psmt != null) {
					conn.close();

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			DBClose.close(conn, psmt, rs);
			
		}
		
		return count;
	}
    
}    
    
		

