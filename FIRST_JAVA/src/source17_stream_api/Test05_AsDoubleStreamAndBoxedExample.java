package source17_stream_api;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test05_AsDoubleStreamAndBoxedExample {
	public static void main(String[] args) {

		int [] intArray = {1, 2, 3, 4, 5};
		
		IntStream intStream = Arrays.stream(intArray); // 스트림 생성
		
		// 중간 처리 intStream.asDoubleStream()로
		// int형의 1, 2, 3, 4, 5를 double형의 1.0, 2.0, 3.0, 4.0, 5.0으로 중간 처리함
		intStream.asDoubleStream()  // 중간 처리(중간 연산)
		.forEach(d -> System.out.println(d)); // 최종 처리(최종 연산) 수행
		
		System.out.println("================================");
		
		intStream = Arrays.stream(intArray); // 스트림 생성
		// 중간 처리로 intStream.boxed()로
		// int형의 1, 2, 3, 4, 5를 Integer 객체형으로 박싱 처리해서 Stream 생성하며,
		intStream.boxed()
		// intValue() 메서드는 Integer 객체에서 int형 값을 가져오는 메서드임.
		.forEach(obj -> System.out.println(obj.intValue())); // 최종 처리(최종 연산) 수행함
	}
}


