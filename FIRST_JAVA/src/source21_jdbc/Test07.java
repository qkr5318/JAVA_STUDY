package source21_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

class MyStudentDB10{
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	ResultSetMetaData rsmd = null;
	
	public MyStudentDB10() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이브 로딩 성공!");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			con = DriverManager.getConnection(url, "SCOTT", "Test1234");
			System.out.println("DB 접속 성공!");
			
			stmt = con.createStatement();
			// select * from student;
			String sql = "select * from student";
			rs = stmt.executeQuery(sql);
			// 메타 데이터(Meta data)란 저장된 데이터 자체가 아니라,
			// 해당 데이터에 대한 정보를 갖는 데이터를 의미함.
			// 예를들면, 데이터베이스 소유 정보, 데이터의 크기에 관련된 정보 등을 말함.
			// ResultSet 객체로 getMetaData() 메서드를 호출하여
			// ResultSetMetaData 객체 생성함.
			rsmd = rs.getMetaData();
			
			// 칼럼 정보 얻어오기
			int count = rsmd.getColumnCount();			
			System.out.println("SCOTT 계정의 student 테이블에서 column 갯수 = " + count + "개 입니다!");
			for (int i = 1; i < count+1; i++) {
				// 칼럼명 얻어오기
				String colName = rsmd.getColumnName(i);
				System.out.println(colName + "\t");
			}
			System.out.println("");
			for (int i = 1; i < count + 1; i++) {
				String typeName = rsmd.getColumnTypeName(i);
				System.out.println(typeName + "\t");
			}			
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
}

public class Test07 {
	public static void main(String[] args) {

		new MyStudentDB10();
		
	}

}
