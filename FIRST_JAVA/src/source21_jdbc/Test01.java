package source21_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class MyStudentDB1{
	
	public MyStudentDB1() throws SQLException {
		Connection con = null;  // DB와 연결을 위한 연결 객체 생성 및 초기화
		Statement stmt = null;  // DB 처리 쿼리문을 담기 위한 stmt 변수 생성 및 초기화
		
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			
			// 2. 드라이버 매니저를 이용해서 DB 접속하고 Connection 객체 얻어오기
			// 오라클 Thin 드라이브 의미
			// 오라클 드라이버에는 Thin 드라이버와 OCI 드라이버가 있습니다.
			// Thin 드라이버는 자바 언어로만 구현된 JDBC 드라이버로서 JDK만 설치되어 있으면
			// 어디서든 사용할 수 있습니다. 반면에 OCI 드라이버는 네이티브(Native) 모듈을 사용하는
			// JDBC 드라이버로서 해당 모듈을 설치해주어야만 사용할 수 있습니다.
			// 위에 오라클 JDBC URL을 보면 jdbc:oracle:thin과 같이 'thin'이 포함되어 있는데,
			// 이는 Thin 드라이버를 사용해서 연결함을 뜻합니다.
			// url = "jdbc:oracle:thin:@서버주소:port번호:SID(전역데이터베이스이름)";
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			// getConnection("DB 서버주소 url", "사용자 계정", "비밀번호");
			con = DriverManager.getConnection(url, "scott", "Test1234");
			System.out.println("DB 접속 성공!");
			
			// 3. SQL 명령어를 실행시키기 위한 객체 생성
			stmt = con.createStatement();
			// 4. 원하는 작업하기
//			String aa = "INSERT INTO STUDENT VALUES(8, '김태희', '010-3333-2222', '서울')";
//			int n = stmt.executeUpdate(aa);
//			System.out.println(n + "개의 데이터가 추가 되었습니다!");

			String upDate = "UPDATE STUDENT SET NAME='전지현', Phone='010-1234-5678' WHERE NUM=2";
			int upCount = stmt.executeUpdate(upDate);
			System.out.println(upCount + "개의 데이터가 수정 되었습니다!");
			
//			String del = "delete from student where num=8";
//			int delCount = stmt.executeUpdate(del);			
//			System.out.println(delCount + "개의 데이터가 삭제 되었습니다!");
			
			
			System.out.println("SQL 명령어가 성공적으로 실행 되었습니다!");
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾지 못했습니다!");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {   // 5. DB 접속 해제하기
			try {
				if(stmt != null) {
					stmt.close();
				}
				if(con != null) {
					con.close();
				}
			} catch (SQLException e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
}

public class Test01 {
	public static void main(String[] args) throws SQLException {
		
		new MyStudentDB1();
	}
}
