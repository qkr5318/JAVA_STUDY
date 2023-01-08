package source13.chapter13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashSet에 String 객체를 추가, 검색, 제거하는 자바 프로그램을 제작해 봅니다.
// String 객체를 중복 없이 저장하는 HashSet 활용 예시입니다.
public class HashSetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // Set 컬렉션에서는 중복 저장 처리가 안됨
		set.add("iBATIS");
		
		int size = set.size(); // 저장된 객체 수 얻기
		System.out.println("총 객체수 : " + size);
		
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("총 객체수 : " + set.size());
		
		iterator = set.iterator();
		for (String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear(); // 모든 객체를 제거하고 비움 처리함.
		if (set.isEmpty()) {
			System.out.println("Set 컬렉션 자료 구조가 비어 있습니다!");
		}
	}
}






