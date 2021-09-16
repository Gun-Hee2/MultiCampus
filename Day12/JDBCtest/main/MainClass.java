package main;

import java.util.List;

import database.DeleteTest;
import database.InsertTest;
import database.JdbcTest;
import database.SelectTest;
import database.UpdateTest;
import database.UpdateTest2;
import db.DBConnection;
import dto.UserDto;

public class MainClass {

	public static void main(String[] args) {
		DBConnection.initConnection();
		
		/*
		    JDBC
		    Java DataBase Connectivity
		    
		 
		*/
	//	JdbcTest jt = new JdbcTest();
		
	//	jt.getConnection();
		
		// insert java -> DB
		
		/*
		InsertTest it = new InsertTest();
		
		String id = "aaa";
		String name = "홍길동";
		int age = 16;
		
		int count = it.insert(id, name, age);
		if(count > 0) {
			System.out.println("정상적으로 추가되었습니다.");
		}
		*/
		
		/*
		UpdateTest ut = new UpdateTest();
		String name = "홍두께";
		int age = 22;
		int count = ut.update(name, age);
		if(count > 0) {
			System.out.println("정상적으로 수정되었습니다.");
		}
		*/
		
		
		/*
		UpdateTest2 ut = new UpdateTest2();
		String name = "홍두께";
		int age = 22;
		int count = ut.update(name, age, "aaa");
		if(count > 0) {
			System.out.println("정상적으로 수정되었습니다.");
		}
		*/
		
		
		/*
		DeleteTest dt = new DeleteTest();
		String name = "홍두께";
		int count = dt.delete(name);
		if(count > 0) {
			System.out.println("정상적으로 삭제되었습니다.");
		}
		*/
		
		/*
		String id = "bbb";
		
		UserDto dto = null;
		
		SelectTest st = new SelectTest();
		
		dto = st.search(id);
		if(dto != null) {
			System.out.println(dto.toString());
		}
		*/
		
		/*
        String id = "bbb";
		
		UserDto dto = null;
		
		SelectTest st = new SelectTest();
		
		dto = st.search2(id);
		if(dto != null) {
			System.out.println(dto.toString());
		}
		*/
		
		/*
		SelectTest st = new SelectTest();
		List<UserDto> list = st.getUsers();
		
		for(UserDto user : list) {
			System.out.println(user.toString());
		}
		*/
	}

}
