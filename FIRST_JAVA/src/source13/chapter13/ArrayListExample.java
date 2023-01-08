package source13.chapter13;

import java.util.ArrayList;
import java.util.List;

// String 객체를 저장하는 ArrayList 활용 예시
public class ArrayListExample {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Java");   // String 객체를 저장 처리함
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println("====================");
		
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println("====================");
		
		for (int i = 0; i < list.size(); i++) {  // 저장된 총 객체 수만큼 루핑해서 데이터를 읽어봄
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println("====================");
		
		list.remove(2);  // 2번 인덱스 객체 Database 삭제 처리됨
		list.remove(2);  // 2번 인덱스 객체 Servlet/JSP 삭제 처리됨
		list.remove("iBATIS");
		
		// 위에서 remove() 처리된 후에 저장된 총 객체 수만큼 루핑해서 데이터를 읽어봄
		for (int i = 0; i < list.size(); i++) {  
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}
}


