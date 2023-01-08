package source04.chapter04;

public class Test12_ForFloatCounterExample {

	public static void main(String[] args) {

		// for문 작성 시 주의 사항 = 초기화식에서 루프 카운터 변수를
		// 선언할 때 부동 소수점을 쓰는 float 타입을 사용하지 말아야 합니다.
		
		// 0.1은 float 타입으로 정확하게 표현할 수 없기 때문에
		// 루프 카운터 변수 x에 더해지는 실제값은 0.1보다 약간 큽니다.
		// 결국 루프는 9번만 실행됩니다.
		for (float x = 0.1f; x <= 1.0f; x+=0.1f) {
			System.out.println(x);
		}

//		for (int x = 1; x <= 10; x++) {
//			System.out.println(x);
//		}
	}

}
