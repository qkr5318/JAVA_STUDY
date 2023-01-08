package source13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test08_HashMap {
	public static void main(String[] args) {

		HashMap<String, String> hashmap = new HashMap<String, String>();
		
		hashmap.put("장나라", "010-1111-2222");
		hashmap.put("김희선", "010-1234-5678");
		hashmap.put("이영애", "010-3456-7778");
		System.out.println(hashmap);
		
		// Value값을 리턴하는 get() 메서드 활용
		System.out.println(hashmap.get("장나라"));
		System.out.println(hashmap.get("BTS"));
		
		// Value값을 대체(변경)하는 replace() 메서드 활용]
		hashmap.replace("장나라", hashmap.get("장나라"), "010-5432-9876");
		System.out.println(hashmap);
		
		// put() 메서드로도 덮어써서 Value 값을 대체(변경)할 수도 있음
		hashmap.put("김희선", "010-9999-8888");
		System.out.println(hashmap.get("김희선"));
		
		// key값이 존재하는지 여부 확인
		System.out.println(hashmap.containsKey("이영애"));
		
		// 삭제는 remove() 메서드를 활용함
		hashmap.remove("이영애");
		System.out.println(hashmap);
		
		// 키셋(keySet) 메서드로 확인
		System.out.println(hashmap.keySet());
		
		// 기본 출력
		System.out.println("기본 출력 : " + hashmap);
		System.out.println("==============================================");
		
		// 출력 1 : 향상된 for each 구문으로 화면 출력 처리함
		System.out.println("[향상된 for each 구문으로 화면 출력함]");
		for (String key : hashmap.keySet()) {
			System.out.println(key + " : " + hashmap.get(key));
		}
		System.out.println("==============================================");
		// 출력 2 : Iterator 순환 반복 선택자 활용 화면 출력 처리함
		System.out.println("[Iterator 순환 반복 선택자 활용 화면 출력함]");
		Set<String> keySet = hashmap.keySet();
		Iterator<String> it = keySet.iterator(); // Iterator형 keySet 화면 출력
		while (it.hasNext()) {
			String key = (String) it.next();
			String value = hashmap.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println("==============================================");
		// 출력 3 : 향상된 for문 Map.Entry 활용 화면 출력 처리함
		System.out.println("[향상된 for문 Map.Entry 활용 화면 출력함]");
		for (Map.Entry<String, String> elem : hashmap.entrySet()) {
			String key = elem.getKey(); // element 요소의 Key값 추출해서 key에 대입해 줌
			String value = elem.getValue(); // element 요소 Value값 추출해서 value에 대입해 줌
			System.out.println(key + " : " + value);
		}
	}
}






