# Day12

## JDBC

JDBC란 자바 안에서 SQL을 실행하기 위해 데이터베이스를 연결해주는 응용프로그램 인터페이스이다.

JDBC를 자바에서 사용하려면 JDBC드라이버가 있어야 한다. 이 JDBC드라이버는 자바 프로그램과 데이터베이스에 연결하기 위한 라이브러리이다. 

DBMS에 따라 DB를 다루는 방식이 다르면 사용자들이 알아야하는 것이 많아지기 때문에 JDBC가 인터페이스들만 제공하고, 나머지는 각 DBMS에 맞게 구현이 되어있다.

따라서, 사용자는 각 DBMS에 맞는 드라이버만 설치하면 된다.

### 이클립스에서 JDBC드라이버 불러오기

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FBG65K%2FbtrfiFAJpj6%2FU9o65vIMxI6QCj6YPIp2x0%2Fimg.png" style="zoom: 33%;" />

우선, 이클립스에서 사용할 JDBC드라이버를 다운받고 다음과 같이 이클립스로 들어온 다음,

JDBC를 사용할 프로젝트에서 마우스 우클릭 선택 후, 위에 사진과 같은 경로로 들어가준다.

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fby5hy0%2FbtrfjWvefQN%2FKA9trCLE8ePPGf0YSEsfG0%2Fimg.png" style="zoom: 33%;" />

그러면, 다음과 같은 Properties창이 새로 생기고, 여기에서 우측의 Add External JARs를 눌러서,

다운받은 JDBC드라이버를 선택 후 열어주고 아래의 Apply를 눌러 적용시켜준다.

이렇게하면 드라이버를 불러오는 작업은 끝이난다.

### JDBC 연결테스트

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FssmrZ%2FbtrffPksHOd%2Fa0setVQVSfDcvndPrDMaUk%2Fimg.png" style="zoom:33%;" />



<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FEd5tQ%2FbtrfgYIiOXc%2FFYDle7P8Nn9IqaSOvIbXu1%2Fimg.png" style="zoom: 33%;" />

위와 같은 경로로 들어가서 Database Development를 선택하고 Open해준다.

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FFwDtT%2FbtrfiGGnEiT%2FOwoFCv9uUJXZGBePHd4FD0%2Fimg.png" style="zoom: 33%;" />

Open해주면 다음과 같이 Data Source Explorer가 열린다. 

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FpzJ8f%2FbtrffO0dN4i%2FLaOgr5hE2EMLebnzVZagfK%2Fimg.png" style="zoom: 33%;" />

이제 여기서 New Oracle에 우클릭하고 Properties를 클릭한다.

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcvLaWI%2FbtrfgGHAsiQ%2FTl1uTED8kWLJ1NWOl5k5PK%2Fimg.png" style="zoom: 33%;" />

그러면 다음과 같이 창이 열리는데 여기서 Connection URL을 볼 수 있고, 해당되는 URL을 복사해준다.

```sql
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static void initConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클 드라이버 불러오기
			
			System.out.println("Driver Loading Success!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
    public static Connection getConnection() { // DB와 연결해주는 메소드
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "HR");
			// jdbc:oracle:thin:@localhost:1521:xe은 위에서 복사해준 URL을 적어준다.
			// 다음으로 오는 HR과 HR은 각각 USER와 PASSWORD이다.
			System.out.println("DB Connection Success!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}

```

위와 같이 패키지명을 db로하고 DB와 연결해주는  DBConnection클래스를 하나 만들어 준다.

다음과 같이 클래스를 미리 만드는 이유는 SELECT, INSERT, UPDATE 등 작업을 할 때 매번 DB와 연결을 해줘야 하는데 편리하게 클래스를 불러와서 연결하기 위해 만들어두는 것이다.

다음으로는 DB 연결을 해제하는 DBClose클래스를 생성한다.

```SQL
package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBClose {
	
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
// Connection : DB연결 객체, Statement/PreparedStatement : SQL쿼리 실행 객체, ResultSet : Select문 결과를 갖는 객체
		try {
			if(conn != null) {
				conn.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(rs != null) {
				rs.close();
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
```

DB연결을 하는 DBConnection클래스와 동일하게 db패키지에 만들어 둔다.

### SELECT

1. 우선 조회를 하기 위한 테이블을 만들어준다.

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FLMmj6%2Fbtrfho0ObcO%2FA5dMtLKbmDWeXpjFFLxI30%2Fimg.png"  />

위와 같이 Database Development로 돌아와서 Open SQL Scrapbook을 열어주고 Type, Name, Database를 각각 설정해주고, USERDTO테이블을 생성해준다.

2.  Java로 돌아와서 user.sql의 데이터에 해당되는 UserDto클래스를 만들어 준다.

```sql
package dto;

public class UserDto {
	private String id;
	private String name;
	private int age;
	private String joindate;
	
	public UserDto() {
		
	}

	public UserDto(String id, String name, int age, String joindate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.joindate = joindate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	@Override
	public String toString() {
		return "UserDto [id=" + id + ", name=" + name + ", age=" + age + ", joindate=" + joindate + "]";
	}

}

```

3. SELECT쿼리를 수행하는 SelectTest클래스를 만든다.

```sql
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBClose;
import db.DBConnection;
import dto.UserDto;

public class SelectTest {
	
	// 다수의 데이터를 취득
	
	public List<UserDto> getUsers(){
		
		String sql = " SELECT ID, NAME, AGE, JOINDATE "
				   + " FROM USERDTO ";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null; //select한 데이터를 받아줌	
		
		List<UserDto> list = new ArrayList<UserDto>();
		
		try {
			conn = DBConnection.getConnection(); // DBConnection클래스의 getConnection()메소드
			psmt = conn.prepareStatement(sql); // SQL 구문을 실행
			rs = psmt.executeQuery(); 실행한 SQL 구문의 데이터 값을 얻음
			
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

```

4. 조회를 하기 위한 데이터를 USERDTO테이블에 넣기 위해 InsertTest클래스를 만든다.

```SQL
package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public int insert(String id, String name, int age) {
		String sql = " INSERT INTO USERDTO(ID, NAME, AGE, JOINDATE) "
				   + " VALUES('" + id + "', '" + name + "'," + age + ", SYSDATE)";
		
		Connection conn = DBConnection.getConnection();
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
```

5. INSERT와 SELECT를 하기 위한 MainClass를 생성해준다.

```SQL
package main;

import java.util.List;

import database.InsertTest;
import database.SelectTest;
import db.DBConnection;
import dto.UserDto;

public class MainClass {

	public static void main(String[] args) {
		DBConnection.initConnection();
		
		/*
		    JDBC
		    Java DataBase Connectivity
		*/
		
		// insert == java -> DB
		
		InsertTest it = new InsertTest();
		
		String id = "aaa";
		String name = "홍두께";
		int age = 22;
		
		int count = it.insert(id, name, age);
		if(count > 0) {
			System.out.println("정상적으로 추가되었습니다.");
		}
		
		InsertTest it = new InsertTest();
		
		String id = "bbb";
		String name = "성춘향";
		int age = 16;
		
		int count = it.insert(id, name, age);
		if(count > 0) {
			System.out.println("정상적으로 추가되었습니다.");
		}
		
		/*
		SelectTest st = new SelectTest();
		List<UserDto> list = st.getUsers();
		
		for(UserDto user : list) {
			System.out.println(user.toString());
		}
		*/
	}
}

```

위와 같이 MainClass를 만들어주고 INSERT를 해주고, 다음과 같이 USERDTO테이블에서 테이블을 SELECT하면 삽입된 데이터 값을 조회할 수 있다.

![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FckxAB1%2FbtrfhexldT9%2FfzkrtxOdXJYC8VDkY7iSck%2Fimg.png)

데이터를 INSERT를 하고 MainClass에서 INSERT부분은 주석처리 해주고 주석처리 되어있는 SELECT구문을 실행해주면 USERDTO에 있는 2개의 데이터를 Java Console에서 조회할 수 있다.

![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fdgp7cc%2FbtrfhfbWOoX%2FZnpyYkN5zgdl2RACMpbLR0%2Fimg.png)

위와 같이 SELECT와 INSERT를 구현할 수 있고, UPDATE, DELETE도 INSERT와 같은 방법으로 SQL쿼리만 바꿔주면 구현할 수 있다.