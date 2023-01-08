package source04;

// 1부터 100까지 숫자 중에서 3의 배수값을 출력하고 3의 배수합도 출력하는
// 자바 프로그램을 제작해 봅니다.
public class Test08 {
	public static void main(String[] args) {
		// 정수형 3의 배수합 변수 thbh를 0으로 초기화(초기값 세팅) 선언함
		int i, thbh = 0;
		
		// for문으로 1부터 100까지 숫자 처리
		for (i = 1; i <= 100; i++) {
			// i%3 == 0 : 3의 배수, i%5 == 0 : 5의 배수
			if(i%3==0) {
				System.out.println(i + ""); // 3의 배수값 화면 출력
				thbh += i; // thbh = thbh + i;
			}
		}
		// 3의 배수합 화면 출력 : 3의 배수 합계 = 1683
		System.out.println("3의 배수 합계 = " + thbh);		
	}
}
