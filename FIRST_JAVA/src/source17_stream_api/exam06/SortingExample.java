package source17_stream_api.exam06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

// 정렬 : 스트림은 데이터 요소가 최종 처리되기 전에 중간 단계에서 요소를 정렬 처리할 수 있습니다.
public class SortingExample {
	public static void main(String[] args) {

		// 숫자 요소일 경우
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4}); // 스트림 생성
		intStream.sorted() // 중간 처리(중간 연산)
		.forEach(n -> System.out.print(n + " ")); // 최종 연산(최종 처리)
		System.out.println("");
		
		// 객체 요소일 경우
		List<Student> studentList = Arrays.asList(new Student("장나라", 98), new Student("김희선", 96), new Student("김다미", 92));
		
		studentList.stream() // 스트림 생성
				   .sorted() // 중간 처리(중간 연산), 객체 요소 정렬 처리
				   .forEach(s -> System.out.print(s.getScore() + " ")); // 최종 처리(최종 연산)
		System.out.println("");
		
		studentList.stream() // 스트림 생성
		.sorted(Comparator.reverseOrder()) // 중간 처리(중간 연산), 객체 요소 역정렬
		.forEach(s -> System.out.print(s.getScore() + " ")); // 최종 연산 처리
	}
}


