package source17_stream_api;

import java.util.Arrays;

public class Test08_AggregateExample {
	public static void main(String[] args) {

		long count = Arrays.stream(new int[] {1, 2, 3, 4, 5}) // 스트림 생성
				.filter(n -> n%2 == 0) // filter() 메서드 활용 2의 배수 필터링 중간 처리
				.count(); // count() 메서드 활용 카운트 집계  최종 처리
		System.out.println("2의 배수는 " + count + "개 입니다!");
		
		long sum = Arrays.stream(new int[] {1, 2, 3, 4, 5}) // 스트림 생성
				.filter(n -> n%2 == 0) // filter() 메서드 활용 2의 배수 필터링 중간 처리
				.sum(); // sum() 메서드 활용 2의 배수 총합계  최종 처리
		System.out.println("2의 배수 총합 = " + sum + "개 입니다!");
		
		double avg = Arrays.stream(new int[] {1, 2, 3, 4, 5}) // 스트림 생성
				.filter(n -> n%2 == 0) // filter() 메서드 활용 2의 배수 필터링 중간 처리
				.average().getAsDouble(); // 2의 배수 평균값을  최종 처리
		System.out.println("2의 배수 평균 = " + avg + "개 입니다!");
		
		int max = Arrays.stream(new int[] {1, 2, 3, 4, 5}) // 스트림 생성
				.filter(n -> n%2 == 0) // filter() 메서드 활용 2의 배수 필터링 중간 처리
				.max().getAsInt(); // int형의 최대값 추출 최종 처리
		System.out.println("2의 배수 중에서 최대값 = " + max);
		
		int maxFull = Arrays.stream(new int[] {1, 2, 3, 4, 5}) // 스트림 생성
				.max().getAsInt(); // int형의 최대값 추출 최종 처리
		System.out.println("스트림 생성 값 중에서 최대값 = " + maxFull);
		
		int min = Arrays.stream(new int[] {1, 2, 3, 4, 5}) // 스트림 생성
				.filter(n -> n%2 == 0) // filter() 메서드 활용 2의 배수 필터링 중간 처리
				.min().getAsInt(); // int형의 최대값 추출 최종 처리
		System.out.println("2의 배수 중에서 최소값 = " + min);
		
		int minFull = Arrays.stream(new int[] {1, 2, 3, 4, 5}) // 스트림 생성
				.min().getAsInt(); // int형의 최대값 추출 최종 처리
		System.out.println("스트림 생성 값 중에서 최대값 = " + minFull);
		
		int first = Arrays.stream(new int[] {1, 2, 3, 4, 5}) // 스트림 생성
				.filter(n -> n%3 == 0) // filter() 메서드 활용 3의 배수값을 추출 중간 처리함
				.findFirst().getAsInt(); // int형의 3의 배수값 중에서 첫번째 값 추출 최종 처리
			    System.out.println("첫번째 3의 배수값 = " + first);
	}
}



