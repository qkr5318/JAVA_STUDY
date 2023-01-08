package source17_stream_api;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test02_FromArrayExample {
	public static void main(String[] args) {

		
		String[] strArray = {"김희선", "장나라", "김다미"};
		Stream<String> strStream = Arrays.stream(strArray); // 스트림 생성
		strStream.forEach(k -> System.out.println(k + " "));
		System.out.println("");
		
		int intArray [] = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArray); // 스트림 생성
		intStream.forEach(i -> System.out.print(i + " "));
	}
}

