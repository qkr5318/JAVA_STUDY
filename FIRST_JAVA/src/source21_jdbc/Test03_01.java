package source21_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class MyStudentDB3{
	
	Connection con = null; // DB와 연결을 위한 연결 객체 생성 및 초기화
	Statement stmt = null; // DB 처리 쿼리문을 담기 위한 stmt 변수 생성 및 초기화
	Scanner scan = new Scanner(System.in);
	
	
   public MyStudentDB3() {
      
      
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
         find();
         
         
         
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

   public void find() throws SQLException {
		System.out.print("조회할 번호를 입력해 주시기 바랍니다==> ");
		int sn = scan.nextInt();
		String sql = "select * from STUDENT where NUM = " + sn;
//		select * from STUDENT where NUM = 5;
		ResultSet rs = stmt.executeQuery(sql);
		if (rs.next()) {
			int num = rs.getInt("NUM");
			String name = rs.getString("NAME");
			String addr = rs.getString("ADDR");
			System.out.println("번호 = " + num + ", 이름 = " + name +", 주소 = " + addr);
		} else {
			System.out.println("검색된 데이터가 없습니다.");
		}
		rs.close();
		
	}
	}


public class Test03_01 {
   
   public static void main(String[] args) {
      
      new MyStudentDB3();
      
   }
}