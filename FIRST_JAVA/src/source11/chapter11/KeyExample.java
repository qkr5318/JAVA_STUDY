package source11.chapter11;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {

		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// 식별키 new Key(1)로 "장나라"를 저장 처리함
		hashMap.put(new Key(1), "장나라");		
		
		// 식별키 new Key(1)로 "장나라"를 읽어 옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);		
	}
}
