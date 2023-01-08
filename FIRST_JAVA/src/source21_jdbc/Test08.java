package source21_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Oracle 11gDB에서는 AutoCommit 기본값 = OFF(false) 상태 입니다!
//Oracle 11gDB에서 AutoCommit 상태 확인 : SQL> show autocommit;
//Oracle 11gDB에서 AutoCommit 켜기 : set autocommit on; -- autocommit IMMEDIATE
//Oracle 11gDB에서 AutoCommit 끄기 : set autocommit off; -- autocommit OFF

//JAVA에서 AutoCommit 기본값 = true 입니다.
//그렇기 때문에, JAVA에서 트랜잭션 처리할 때, AutoCommit을 false로 설정하고 시작합니다!
//즉, JAVA에서 setAutoCommit(false) 처리를 하게 됩니다.

class MyStudentDB11{
	
	Connection con = null;
	Statement stmt = null;
	
	public MyStudentDB11() {
		System.out.println("MyStudentDB11() 생성자가 실행됩니다!");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이브 로딩 성공!");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			con = DriverManager.getConnection(url, "SCOTT", "Test1234");
			System.out.println("DB 접속 성공!");
			
			// 연결에 자동 커밋 모드를 사용하려면 true, 사용하지 않으려면 false를 설정합니다.
			con.setAutoCommit(false);
			stmt = con.createStatement();
			
//			INSERT INTO student VALUES(400,'김태희','010-1112-1233','마포구');
//			INSERT INTO student VALUES(500,'아이유','010-2232-2224','성동구');
//			INSERT INTO student VALUES(600,'이경규','010-3334-3333','구로구');
			String sql1 = "INSERT INTO student VALUES(400,'손흥민','010-1112-1233','마포구')";
			String sql2 = "INSERT INTO student VALUES(500,'손오공','010-2232-2224','성동구')";
			String sql3 = "INSERT INTO student VALUES(600,'퐁키2','010-3334-3333','구로구')";
			
			stmt.executeUpdate(sql1); // executeQuery()메서드는 SELECT문 처리
			stmt.executeUpdate(sql2); 
			stmt.executeUpdate(sql3); 
			
			con.commit();
			System.out.println("3건의 데이터 추가가 성공적으로 이루어졌습니다!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 파일을 못찾겠습니다!");
			if (con != null) {
				try {
					con.rollback();
					System.out.println("데이터 처리에 문제가 있어서 Rollback이 처리 되었습니다!");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		} catch (SQLException e) {
			System.out.println("SQL 쿼리문에 문제가 있습니다!");
			if (con != null) {
				try {
					con.rollback();
					System.out.println("데이터 처리에 문제가 있어서 Rollback이 처리 되었습니다!");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		} finally {
			// DB 접속 해제하기
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				} 
				}	catch (SQLException e) {
					System.out.println("SQL 쿼리문에 문제가 있습니다!");
				}
			}
		}
}


public class Test08 {
	public static void main(String[] args) {
		System.out.println("main() 함수가 제일 먼저 실행됩니다!");
		new MyStudentDB11();
	}
}

