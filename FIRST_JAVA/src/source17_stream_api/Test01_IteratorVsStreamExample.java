package source17_stream_api;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Test01_IteratorVsStreamExample {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("김희선", "장나라", "이영애");
		
		// Iterator(순환 반복 선택자) 활용
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String name = (String) iterator.next();
			System.out.println(name);
		}
		System.err.println("=======================");
		
		// Stream 이용
		Stream<String> stream = list.stream(); // 스트림 생성
		stream.forEach(sname -> System.out.println(sname));
	}
}


