package source17_stream_api;

import java.util.Arrays;
import java.util.List;

//필터링이란?
//중간 처리 기능으로 요소를 걸러내는 역할을 처리함
//필터링 메소드인 distinct() 와 filter() 메서드를 주로 활용함.
//모든 스트림이 갖고 있는 공통 메서드임
public class Test04_FilteringExample {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("장나라", "김희선", "김다미", "이영애", "장나라");
		names.stream() // 스트림 생성
			 .forEach(n -> System.out.println(n));
		System.out.println("================================");
		
		names.stream() // 스트림 생성
			 .distinct() // 중간 처리(중간 연산)에서 distinct() 메서드 활용 중복값 필터링(제외) 처리함
			 .forEach(n -> System.out.println(n)); // 최종 처리(최종 연산)
		System.out.println("================================");
		
		names.stream() // 스트림 생성
		// 중간 처리(중간 연산)에서 filter() 메서드의 매개값으로 주어진 Predicate(여기서는 "장"으로 시작하는)가 true를 리턴하는 요소만 필터링 처리함
		     .filter(n -> n.startsWith("장"))
		     .forEach(n -> System.out.println(n)); // 최종 처리(최종 연산)		
		System.out.println("================================");
		
		names.stream() // 스트림 생성
		// 중간 처리(중간 연산)에서 filter() 메서드의 매개값으로 주어진 Predicate(여기서는 "장"으로 시작하는)가 true를 리턴하는 요소만 필터링 처리함
		     .filter(n -> n.startsWith("장"))
		     .distinct() // 중간 처리(중간 연산)에서 distinct() 메서드 활용 중복값 필터링(제외) 처리함
		     .forEach(n -> System.out.println(n)); // 최종 처리(최종 연산)
	}
}


