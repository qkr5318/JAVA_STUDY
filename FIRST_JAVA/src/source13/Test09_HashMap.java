package source13;

import java.util.HashMap;
import java.util.Iterator;

//HashMap<K, V> 클래스
//HashMap 클래스는 Map 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나입니다.
//JDK 1.2부터 제공된 HashMap 클래스는 해시 알고리즘(hash algorithm)을 사용하여
//검색 속도가 매우 빠릅니다. HashMap 클래스는 Map 인터페이스를 구현하므로,
//중복된 키로는 값을 저장할 수 없습니다. 하지만, 같은 값을 다른 키로 저장하는 것은 가능합니다.
public class Test09_HashMap {
	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		// put() 메서드를 활용한 데이터 요소의 저장
		hm.put("삼십", 30);
		hm.put("사십", 40);
		hm.put("이십", 20);
		System.out.println("맵에 저장된 키들의 집합 : " + hm.keySet());
		System.out.println("=======================================");
		for (String key : hm.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
		}
		System.out.println("=======================================");
		// remove() 메서드를 활용한 데이터 요소의 제거
		hm.remove("사십");
		Iterator<String> keys = hm.keySet().iterator();
		while (keys.hasNext()) {
			String key = (String) keys.next();
			System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
		}
		System.out.println("=======================================");
		// replace() 메서드를 활용한 데이터 요소의 값 변경 처리
		hm.replace("이십", 200);
		for (String key : hm.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
		}
		System.out.println("=======================================");
		// size() 메서드 활용 데이터 요소의 총 개수 확인
		System.out.println("맵에 저장된 객체의 숫자(크기) = " + hm.size());
	}
}




