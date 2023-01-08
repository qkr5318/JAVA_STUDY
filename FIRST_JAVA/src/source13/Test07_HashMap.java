package source13;

import java.util.HashMap;
import java.util.Map;

public class Test07_HashMap {
	public static void main(String[] args) {

		// HashMap 구조(key, value) : hash는 "으깨다"라는 뜻으로,
		// Hash는 Hash Table을 이용하여 데이터를 저장 처리합니다.
		// 이때, 출력엔 순서가 없습니다!
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("apple", 3);
		m.put("banana", 5);
		m.put("grape", 10);
		m.put("strawberry", 1);
		
		System.out.println(m.size() + " 종류의 과일이 있습니다!");
		
		// Set<K> keySet() : Map에 포함된 key를 Set 타입으로 변환 저장 처리함.
		for (String key : m.keySet()) {
			System.out.println(key + "가 " + m.get(key) + "개 있습니다!");
		}
		System.out.println("=============================================");
		
		String key = "banana";
		if(m.containsKey(key)) {
			System.out.println(key + "가 " + m.get(key) + "개 있습니다!");
		}
		m.remove("apple"); // apple만 제거 처리함
		System.out.println("사과를 없앤 후 과일은 " + m.size() + "종류 입니다!");
		
		m.clear(); // Map 컬렉션 자료 구조에서 객체들을 모두 없애버림.
		System.out.println("모두 없앤 후 과일은 " + m.size() + "종류 입니다!");
	}
}



