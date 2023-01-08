package source17_stream_api.exam02;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {

		List<Student> studentList = Arrays.asList(new Student("김희선", 98), new Student("장나라", 96), new Student("이영애", 94));
		
		double avg = studentList.stream()    // stream() 스트림 생성
				.mapToInt(Student::getScore) // 중간처리(학생 객체를 점수로 매핑)
				.average().getAsDouble();    // 최종처리(평균 점수를 구해줌)
		System.out.println("평균 점수 = " + avg);
	}
}

