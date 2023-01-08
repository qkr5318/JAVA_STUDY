package source17_stream_api;

import java.util.Arrays;

//매칭 : 최종 처리 단계에서 요소들이 특정 조건에 만족하는지 조사하는 것
//allMatch() 메서드 : 모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하는 조사
//anyMatch() 메서드 : 최소한 한 개의 요소가 매개값으로 주어진 Predicate 조건을 만족하는지 조사
//noneMatch() 메서드 : 모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하지 않는지 조사
public class Test07_MatchExample {

	public static void main(String[] args) {

		int[] intArray = {2, 4, 6};
		
		boolean result = Arrays.stream(intArray) // 스트림 생성
				// 최종 처리 allMatch() 메서드 활용 2의 배수값 확인함
				.allMatch(a -> a%2 == 0);
		System.out.println("모두 2의 배수인가요? " + result);
	
		result = Arrays.stream(intArray) // 스트림 생성
				// 최종 처리 anyMatch() 메서드 활용 3의 배수값 확인함
				.anyMatch(a -> a%3 == 0);
		System.out.println("하나라도 3의 배수인가요? " + result);
		
		result = Arrays.stream(intArray) // 스트림 생성
				// 최종 처리 noneMatch() 메서드 활용 3의 배수값 확인함
				.noneMatch(a -> a%3 == 0);
		System.out.println("3의 배수가 하나도 없나요? " + result);
	}

}
