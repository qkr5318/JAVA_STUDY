package source21_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class MyStudentDB2{
   public MyStudentDB2() {
      Connection con = null; // DB와 연결을 위한 연결 객체 생성 및 초기화
      Statement stmt = null; // DB 처리 쿼리문을 담기 위한 stmt 변수 생성 및 초기화
      ResultSet rs = null; // 결과 집합 조회를 위한 rs 변수 생성 및 초기화
      
      try {
         // 1. 드라이버 로딩
         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("드라이브 로딩 성공!");
         // 2. 드라이버 매니저를 이용해서 DB 접속하고 Connection 객체 얻어오기
         String url = "jdbc:oracle:thin:@localhost:1521:orcl";
         con = DriverManager.getConnection(url, "scott", "Test1234");
         System.out.println("DB 접속 성공!");
         
         // 3. SQL 명령어를 실행시키기 위한 객체 생성.
         stmt = con.createStatement();
          
         // 4. 원하는 작업하기
         String sql = "SELECT NUM, NAME, PHONE, ADDR FROM STUDENT"; 
               
         rs = stmt.executeQuery(sql);
         
         // rs.next();// 다음 행으로 이동, 다음 행이 없으면 false 리턴 처리함
         while (rs.next()) {
			// 현재행의 NUM 칼럼값 얻어오기
        	 int NUM = rs.getInt("NUM");
        	// 현재행의 NUM 칼럼값 얻어오기
        	 String NAME = rs.getString("NAME");
        	// 현재행의 NUM 칼럼값 얻어오기
        	 String PHONE = rs.getString("PHONE");
        	// 현재행의 NUM 칼럼값 얻어오기
        	 String ADDR = rs.getString("ADDR");
        	 System.out.println("번호 = " + NUM + ", 이름 = " + NAME + ", 전화번호 = " + PHONE + ", 주소 = " + ADDR);
        	 
		}
      
         
         
      } catch (ClassNotFoundException e) {
    	  System.out.println("해당 클래스를 찾지 못했습니다.");
    	  e.printStackTrace();
      } catch (SQLException e) {
		System.out.println("SQL 예외가 발생했습니다");
	}finally {
		// 5. DB 접속 해제하기
		try {
		if (stmt != null) {
				stmt.close();
		}
				if (con != null) {
					con.close();
		}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
   }
}


public class Test02 {
   
   public static void main(String[] args) {
      
      new MyStudentDB2();
      
   }
}