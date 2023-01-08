package source17_stream_api;

import java.util.Arrays;

//루핑(looping) : 요소 전체를 반복 처리하는 것

//peek() : 중간 처리 메서드
//중간 처리 단계에서 전체 요소를 루핑하며 추가 작업하기 위해 사용함.
//최종 처리 메서드가 실행되지 않으면 지연 처리됨.
//반드시, 최종 처리 메서드가 호출되어야 동작함.

//forEach() : 최종 처리 메서드
//파이프라인 마지막에 루핑하며 요소를 하나씩 처리함.
//요소를 소비하는 최종 처리 메서드임.
//sum() 메서드와 같은 다른 최종 처리 메서드는 호출 불가능함.
public class Test06_LoopingExample {
	public static void main(String[] args) {

		int[] intArray = {1, 2, 3, 4, 5};
		System.out.println("[peek() 메서드를 마지막에 호출한 경우]");
		Arrays.stream(intArray) // 스트림 생성
		// filter() 메서드를 활용하여 2의 배수를 필터링 중간 처리함
		.filter(a -> a%2 == 0)
		// peek() 메서드도 중간 처리 연산자이며, 최종 처리 메서드가 호출되어야 동작함.
		// 지금은 최종 처리 메서드가 호출되지 않았기 때문에 동작하지 않음
		.peek(n -> System.out.println(n));
		
		System.out.println("[최종 처리 메서드를 마지막에 호출한 경우]");
		int total = Arrays.stream(intArray) // 스트림 생성
				// filter() 메서드를 활용하여 2의 배수를 필터링 중간 처리함.
				.filter(a -> a%2 == 0)
				.peek(n -> System.out.println(n)) // 2의 배수값들을 화면으로 보여줌
				.sum(); // 앞서 2의 배수값들을 sum() 메서드 이용해서 합계 결과 최종 처리함
		System.out.println("2의 배수값들의 총합 = " + total);
		
		System.out.println("[forEach() 메서드를 마지막에 호출한 경우]");
		Arrays.stream(intArray) // 스트림 생성
			.filter(a -> a%2 == 0) // filter() 메서드로 2의 배수값들을 필터링 중간 처리함
			// forEach() 메서드는 최종 처리(연산) 메서드이고,
			// 파이프라인 마지막에 루핑하여 요소를 하나씩 처리함.
			.forEach(n -> System.out.println(n)); // forEach() 메서드 최종 처리함
	}
}

