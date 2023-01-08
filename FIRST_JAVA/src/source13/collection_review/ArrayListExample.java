package source13.collection_review;

import java.util.ArrayList;
import java.util.List;

// List 컬렉션 자료구조형의 List 인터페이스를 구현(implements)하는 구현 클래스인 ArrayList 클래스 활용해서
// String 객체 추가, 검색, 삭제하는 자바 프로그램을 제작해 봅니다.
public class ArrayListExample {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size(); // List 컬렉션 자료 구조에 저장 처리된, 총 객체의 수를 알아봄
		System.out.println("총 객체수 : " + size);
		
		list.remove(2);		
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}
}


