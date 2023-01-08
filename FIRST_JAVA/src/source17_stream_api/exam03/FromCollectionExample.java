package source17_stream_api.exam03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
	public static void main(String[] args) {

		List<Student> studentList = Arrays.asList(new Student("김희선", 98), new Student("장나라", 96), new Student("김다미", 94));
		
		Stream<Student> stream = studentList.stream(); // 스트림 생성
		stream.forEach(s -> System.out.println(s.getScore()));
	}
}

