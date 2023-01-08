package source21_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class MyStudentDB7{
	
	Connection con = null; // DB와 연결을 위한 연결 객체 생성 및 초기화
	Statement stmt = null; // DB 처리 쿼리문을 담기 위한 stmt 변수 생성 및 초기화
	Scanner scan = new Scanner(System.in);
	
	
   public MyStudentDB7() {
      
      
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
//         	find();
//         	update();
//         	insert();
//         	delete();
         
         
         
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

public void delete() throws SQLException {
	System.out.print("삭제할 번호를 입력해 주시기 바랍니다==> ");
	int delNumber = scan.nextInt();
	//delete from STUDENT where num = 8
	String sql ="delete from STUDENT where num = " + delNumber;
	int deleteCount = stmt.executeUpdate(sql);
	System.out.println(deleteCount + "개의 데이터가 삭제 되었습니다.");
}

public void insert() throws SQLException {
	System.out.print("삽입할 번호를 입력해 주시기 바랍니다==> ");
	int num = scan.nextInt();
	System.out.print("삽입할 이름을 입력해 주시기 바랍니다==> ");
	String name = scan.next();
	System.out.print("삽입할 연락처 정보를 입력해 주시기 바랍니다==> ");
	String phone = scan.next();
	System.out.print("삽입할 주소 정보를 입력해 주시기 바랍니다==> ");
	String addr = scan.next();
	String sql = "insert into STUDENT values(" + num + ", '" + name + "' " + ", '" + phone + "'" + ", '" + addr + "')";
	//insert into STUDENT values(7, '김연아', '010-2222-3333', '독도')
	int insertCount = stmt.executeUpdate(sql);
	System.out.println(insertCount + "개의 데이터가 입력되었습니다.");
}

public void update() throws SQLException {
	System.out.print("주인님 수정할 번호를 입력해 주시기 바랍니다==> ");
	int sn = scan.nextInt();
	System.out.print(sn + "번 학생의 수정할 주소를 입력해 주세요==>" );
	String addr = scan.next();
	String sql = "update STUDENT set ADDR = ' "+ addr +" ' where NUM = " + sn;
	int updateCount = stmt.executeUpdate(sql);
	System.out.println(updateCount + "개의 데이터가 수정 되었습니다.");
}

public void find() throws SQLException {
	System.out.print("조회할 번호를 입력해 주시기 바랍니다==> ");
	int sn = scan.nextInt();
	String sql = "select * from STUDENT where NUM = " + sn;
//	select * from STUDENT where NUM = 5;
	ResultSet rs = stmt.executeQuery(sql); //executeQuery = select
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

 // 습관적으로 쓴다고 생각
// 5. DB 접속 해제하기
public void dbClose() {

	try {
	if (stmt != null) {
			stmt.close();
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


public class Test04 {
   
   public static void main(String[] args) throws SQLException {
      
//      new MyStudentDB7();
	   MyStudentDB7 db07 = new MyStudentDB7();
	   Scanner scan = new Scanner(System.in);
	   while (true) {
		System.out.println("=====[ JAVA CRUD 프로그램 이용을 환영합니다 ]=====");
		System.out.println("=== 1. 추가, 2. 삭제, 3. 검색, 4. 수정, 5. 종료 ===");
		
		int num = scan.nextInt();
		switch (num) {
		case 1:
			db07.insert();
			break;
		case 2:
			db07.delete();
			break;
		case 3:
			db07.find();
			break;
		case 4:
			db07.update();
			break;
		case 5:
			System.out.println("=====[서비스를 이용해 주셔서 감사합니다.]=====");
			db07.dbClose();
			System.exit(0); // 시스템 종료
			scan.close();
		}
	}
      
   }
}