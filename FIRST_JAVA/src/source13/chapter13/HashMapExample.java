package source13.chapter13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 이름을 키로, 점수를 값으로 저장 처리하는 HashMap의 사용 방법을 보여주는 자바 프로그램을 제작해 봅니다.
// 이름을 키로 점수를 값으로 저장 처리함
public class HashMapExample {
	public static void main(String[] args) {

		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 저장 처리함
		map.put("장나라", 85);
		map.put("김희선", 90); // "김희선" 키가 같기 때문에 제일 마지막에 저장한 값으로 대체 처리함
		map.put("이영애", 80);
		map.put("김희선", 95); // "김희선" 키가 같기 때문에 제일 마지막에 저장한 값으로 대체 처리함

		// Map 컬렉션 자료구조에 저장된 총 Map.Entry 수 얻기
		System.out.println("총 Map.Entry 수 : " + map.size()); 
		
		// 객체 찾기                       // 이름(Key)으로 점수(Value)값을 검색해서 나타내줌
		System.out.println("\t장나라 Key의 Value값 : " + map.get("장나라")); 
		System.out.println("=========================================");
		
		// 객체를 하나씩 처리함 : 저장된 전체 객체를 대상으로 하나씩 얻고 싶을 경우 첫번째 방법 : keySet() 메서드 활용
		// keySet() 메서드로 모든 키를 Set 컬렉션으로 얻은 다음, 반복자(Iterator)를 통해 키를 하나씩 얻고
		// get() 메서드를 통해 값을 얻는 방법임
		Set<String> keySet = map.keySet();  // Key Set 얻기
		// 반복해서 키(Key)를 얻고 값(Value)을 Map에서 얻어냄
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = (String) keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println("=========================================");
		
		// 객체 삭제 처리
		map.remove("김다미");  // 키(Key)로 Map.Entry 객체를 제거 처리함
		System.out.println("총 Map.Entry 객체 수 : " + map.size());
		
		// 객체를 하나씩 처리함 : 저장된 전체 객체를 대상으로 하나씩 얻고 싶을 경우 두번째 방법 : entrySet() 메서드 활용
		// entrySet() 메서드로 모든 Map.Entry를 Set 컬렉션으로 얻은 다음, 반복자(Iterator)를 통해
		// Map.Entry를 하나씩 얻고 getKey()와 getValue() 메서드를 이용해 키(Key)와 값(Value)을 얻는 방법입니다.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.Entry Set 객체 얻기
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		// while문을 이용해서, 반복적으로 Map.Entry를 얻고, 키(Key)와 값(Value을 얻어냄
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) entryIterator
					.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);			
		}
		System.out.println("=========================================");
		// 객체 전체 삭제
		map.clear();  // 모든 Map.Entry 객체 삭제 처리함
		System.out.println("Map.Entry의 총 Entry 수 = " + map.size());
	}
}


