package source13.chapter13;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample_Student {

	public static void main(String[] args) {

		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		// 학번(sno)과 이름(name)이 동일한 Student 객체를 키(Key)로 저장 처리함
		map.put(new Student(1, "장나라"), 95);
		System.out.println(map.hashCode());
		map.put(new Student(1, "장나라"), 95);
		System.out.println(map.hashCode());
		
		// Map 컬렉션에 저장된 총 Map.Entry 객체수 얻기
		System.out.println("총 Map.Entry 수 : " + map.size());		
	}
}


