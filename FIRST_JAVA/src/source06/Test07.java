package source06;

/* 정적(static) 블록 사용
정적 변수의 초기화 과정이 for 문이나 오류 처리처럼 복잡하다면, 코딩 과정이
간단하지 않을 것인데, 대신에 정적 변수의 초기화가 복잡할 때는 다음과 같이
정적(static) 블록을 사용할 수도 있음 */

//1부터 10까지 숫자합(1+2+...+10)

public class Test07 {
	
	static int sumOneToTen;
	
	static {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i; // sum = sum + i;
		}
		sumOneToTen = sum;
	}
	public static void main(String[] args) {
		System.out.println(sumOneToTen);		
	}
}
