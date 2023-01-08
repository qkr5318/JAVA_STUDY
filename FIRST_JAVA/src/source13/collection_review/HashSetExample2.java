package source13.collection_review;

import java.util.HashSet;
import java.util.Set;

// Member 객체를 중복 없이 저장 처리하는 HashSetExample2 클래스 소스 코딩
public class HashSetExample2 {
	public static void main(String[] args) {

		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("장나라", 30));
		System.out.println(set.hashCode());
		set.add(new Member("장나라", 30));
		System.out.println(set.hashCode());
		
		System.out.println("Set 컬렉션에 저장된 총 객체수 : " + set.size());
	}
}



