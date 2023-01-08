package source21_jdbc.review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Review01 {
	
	public Review01() throws ClassNotFoundException, SQLException {
		System.out.println("main() 함수 실행 되면서 그 안에 있는 Review01() 생성자가 실행됩니다!");
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이브 로딩 성공!");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			con = DriverManager.getConnection(url, "SCOTT", "Test1234");
			System.out.println("DB 접속 성공!");
			
			stmt = con.createStatement();
			
			// INSERT INTO student VALUES(10,'이영애','010-6789-3457','캐나다');
//			String sql = "INSERT INTO student VALUES(10,'이영애','010-6789-3457','캐나다')";
//			int insertCount = stmt.executeUpdate(sql);
//			System.out.println(insertCount + "개의 데이터가 추가 되었습니다!");
			
			// SELECT NUM, NAME, PHONE, ADDR FROM STUDENT;
//			String sql = "SELECT NUM, NAME, PHONE, ADDR FROM STUDENT";
//			
//			ResultSet rs = null;  // 결과 집합값 조회를 위한 rs 변수 선언 및 초기화
//			
//			rs = stmt.executeQuery(sql);
//			
//			while (rs.next()) {
//				int NUM = rs.getInt("NUM");
//				String NAME = rs.getString("NAME");
//				String PHONE = rs.getString("PHONE");
//				String ADDR = rs.getString("ADDR");
//				
//				System.out.println("번호 = " + NUM + ", 이름 = " + NAME + ", 주소 = " + ADDR);
//			}
			
			// update STUDENT set ADDR = '프랑스' where NUM = 2;
//			String upDate = "update STUDENT set ADDR = '그리스' where NUM = 2";
//			int upCount = stmt.executeUpdate(upDate);
//			System.out.println(upCount + "개의 데이터가 수정 되었습니다!");			
			
			// delete from STUDENT where num = 2;
			String del = "delete from STUDENT where num = 2";
			int delCount = stmt.executeUpdate(del);
			System.out.println(delCount + "개의 데이터가 삭제 되었습니다!");			
			
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾지 못했습니다~~~~ ^-^/");
		} 	
		catch (SQLException e) {
			System.out.println("SQL 쿼리문에 문제가 있습니다~~~ ^-^!");
		} finally {
			// DB 접속 해제하기
			try {
				if(stmt != null) {
					stmt.close();
				}
				if(con != null) {
					con.close();
				}
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("제일 먼저! main() 함수가 실행 됩니다!");
		new Review01();
	}
}
