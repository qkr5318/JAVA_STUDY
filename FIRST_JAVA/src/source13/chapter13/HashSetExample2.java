package source13.chapter13;

import java.util.HashSet;
import java.util.Set;

// Member 객체를 중복 없이 저장 처리하는 HashSet 활용 예시 자바 프로그램 제작!
public class HashSetExample2 {

	public static void main(String[] args) {

		Set<Member> set = new HashSet<>();
		
		// 인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장 처리됨
		set.add(new Member("장나라", 30));
		System.out.println(set.hashCode());
		set.add(new Member("장나라", 30));
		System.out.println(set.hashCode());
		
		System.out.println("Set 컬렉션 자료 구조에 저장된 총 객체수 : " + set.size());
	}
}




