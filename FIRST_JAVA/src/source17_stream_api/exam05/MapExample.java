package source17_stream_api.exam05;

import java.util.Arrays;
import java.util.List;

// 매핑 : mapXXX() 메서드
// 데이터 요소를 대체하는 요소로 구성된 새로운 스트림을 리턴 처리해 줍니다.
// 다음은 메서드(매개변수) mapToInt(ToIntFuction<T>) : T(요소) -> int(대체요소) 예시
public class MapExample {
	public static void main(String[] args) {

		List<Student> studentList = Arrays.asList(new Student("장나라", 98), new Student("김희선", 96), new Student("김다미", 92));
		
		studentList.stream()  // 스트림 생성
		// mapToInt(ToIntFunction<T>) : T(요소) -> int(대체요소)
		.mapToInt(Student::getScore) // 중간 처리(중간 연산)
		.forEach(score -> System.out.println(score));  // 최종 처리(최종 연산)
	}
}
 

