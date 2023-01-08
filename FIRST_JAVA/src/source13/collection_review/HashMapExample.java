package source13.collection_review;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 다음은 이름을 키(Key)로, 점수를 값(Value)으로 저장 처리하는
// HashMapExample 클래스 소스 코딩 예시 입니다.
public class HashMapExample {
	public static void main(String[] args) {

		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 저장 처리
		map.put("장나라", 85);
		map.put("김희선", 90);
		map.put("이영애", 100);
		map.put("김희선", 95);
		System.out.println("총 Map 컬렉션에 저장 처리된 Map.Entry 수 : " + map.size());
		
		// 객체 찾기
		System.out.println("장나라 객체의 점수값 객체 찾기 : " + map.get("장나라"));
		System.out.println("=============================================");
		
		// 첫번째 객체를 하나씩 찾기 방법 : keySet() 메서드 활용
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = (String) keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println("=============================================");
		
		// 객체 삭제 처리
		map.remove("이영애");
		System.out.println("총 Map.Entry 수 : " + map.size());
		
		// 두번째 객체를 하나씩 찾기 방법 : entrySet() 메서드 활용
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println("=============================================");		
		// 객체 전체 삭제
		map.clear(); // 모든 Map.Entry 삭제 처리함
		System.out.println("clear() 메서드 활용 후에 Map.Entry 수 : " + map.size());
	}
}




