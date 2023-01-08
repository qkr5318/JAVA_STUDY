package source21_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//PreparedStatement 인터페이스
//1. Statement 인터페이스의 자식 인터페이스임(Statement 인터페이스의 기능 향상)
//2. SQL문을 미리 만들어 두고(미리 준비해 두고) 사용할 수 있기 때문에
// 효율성이나 유지보수 면에서 효과적임.
//3. 매개변수의 인수값과 관련된 작업이 특화됨.
//4. 코드 안정성이 높으며, 가독성도 좋음.
//5. 코드량이 증가할 수 있음. 매개변수를 set처리 해줘야 하기 때문임. 

class MyStudentDB8{
	
	Connection con = null; // DB와 연결을 위한 연결 객체 생성 및 초기화
	PreparedStatement pstmt = null; // DB 처리 쿼리문을 담기 위한 pstmt 변수 생성 및 초기화
	
	
   public MyStudentDB8() {
      
      
      try {
         // 1. 드라이버 로딩
         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("드라이브 로딩 성공!");
         // 2. 드라이버 매니저를 이용해서 DB 접속하고 Connection 객체 얻어오기
         String url = "jdbc:oracle:thin:@localhost:1521:orcl";
         con = DriverManager.getConnection(url, "scott", "Test1234");
         System.out.println("DB 접속 성공!");
         
         // PreparedStatement 객체에 저장될 sql 구문은
         // 변수가 들어갈 위치에 ? 를 넣습니다.
         // DELETE 예시 = DELETE from student WHERE NUM =8;
         
         String sql = "DELETE from student WHERE NUM = ?";
         
         // 3. SQL 명령어를 실행시키기 위한 객체 생성.
         pstmt = con.prepareStatement(sql);
          
         // 4. 원하는 작업하기
//         	student 테이블에서 NUM 칼럼의 조건(WHERE절)이 5번인 데이터 삭제 처리를 해봄
         pstmt.setInt(1, 7);
         int delCount = pstmt.executeUpdate();
         System.out.println(delCount + "개 데이터가 삭제 되었습니다.");
         
         
      } catch (ClassNotFoundException e) {
    	  System.out.println("해당 클래스를 찾지 못했습니다.");
    	  e.printStackTrace();
      } catch (SQLException e) {
		System.out.println("SQL 예외가 발생했습니다");
	}
//		finally {
//		// 5. DB 접속 해제하기
//		try {
//		if (stmt != null) {
//				stmt.close();
//		}
//				if (con != null) {
//					con.close();
//		}
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		}
//	}
   }
 // 습관적으로 쓴다고 생각
// 5. DB 접속 해제하기
	public void dbClose() {
	
		try {
		if (pstmt != null) {
				pstmt.close();
		}
				if(con != null) {
					con.close();
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Test05 {
   
   public static void main(String[] args) throws SQLException {
      
      new MyStudentDB8();
	  
		}
}