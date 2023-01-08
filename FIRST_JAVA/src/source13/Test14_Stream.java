package source13;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test14_Stream {
	public static void main(String[] args) {

		int [] ia = {1, 6, 3, 9, 5, 4, 2};
		
		IntStream is = Arrays.stream(ia);
		// Arrays.stream() 메서드를 활용해서 ia 요소들을 is에
		// IntStream(원시데이터형 int를 스트림형식으로 다룰 수 있도록 해줌) 형식으로 선언함
		                              
		int sum = is.filter(i -> i>5).sum();
		
		// Arrays.stream() 메서드 활용 컬렉션에서 스트림 형식의 데이터를 읽어옵니다.
		// is.filter(i -> i>5) : filter() 메서드 활용해서, 매개변수 i가 5보다 큰 원소만 추출합니다.
		// .sum() 메서드로 앞서 추출된  6과 9의 합을 연산 처리합니다.
		
		System.out.println("5보다 큰 원소의 총합 = " + sum);
	}
}



