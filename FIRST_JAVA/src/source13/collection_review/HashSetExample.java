package source13.collection_review;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set 컬렉션 자료 구조에 HashSet 활용 String 객체를 추가, 검색, 제거하는 자바 프로그램을 제작해 봅니다.
public class HashSetExample {
	public static void main(String[] args) {

		
		Set<String> set = new HashSet<String>();
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size(); // Set 컬렉션 자료 구조에 저장된 객체 수를 읽어옴
		System.out.println("총 객체수 : " + size);
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		System.out.println("총 객체수 : " + set.size());
		
		iterator = set.iterator();
		for (String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear(); // Set 컬렉션 자료형 구조에 있는 모든 객체들을 제거하고 비움 처리함
		if (set.isEmpty()) {
			System.out.println("Set 컬렉션 자료형 구조에 객체가 없습니다. 즉, 비어 있습니다.");
		}
	}

}
