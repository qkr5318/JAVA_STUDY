package source17_stream_api;

import java.util.stream.IntStream;

public class Test03_FromIntRangeExample {
	
	// public static int sum; 구문에서
	// 자동으로 public static int 형의 sum 변수값이 0으로 초기화됨
	public static int sum;

	public static void main(String[] args) {

		IntStream stream = IntStream.rangeClosed(1, 100); // 1~ 100 범위의 스트림 생성
		stream.forEach(r -> sum += r);
		System.out.println("총합 = " + sum); // 1부터 100까지 합계값 sum 화면 출력
	}
}

