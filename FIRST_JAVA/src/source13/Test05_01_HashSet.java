package source13;

import java.util.HashSet;

public class Test05_01_HashSet {
	public static void main(String[] args) {

		HashSet<String> hs01 = new HashSet<String>();
		HashSet<String> hs02 = new HashSet<String>();
		
		hs01.add("장나라");
		hs01.add("김희선");
		
		System.out.println(hs01.add("김다미")); // true
		System.out.println(hs01.add("김다미")); // false (중복값을 넣을 수 없기 때문임)
		System.out.println("===================================================");
		
		for (String string : hs01) {
			System.out.println(string + " ");
		}
		System.out.println("===================================================");

		hs02.add("김태희");
		hs02.add("전지현");
		hs02.add("이영자");
		
		for (String string : hs02) {
			System.out.println(string + " ");
		}
		System.out.println("\nSet 컬렉션 자료형에서 집합의 크기 : " + hs02.size());
	}
}








