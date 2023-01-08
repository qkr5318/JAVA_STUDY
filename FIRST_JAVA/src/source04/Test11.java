package source04;

// 기타 for문 : 여러 개의 초깃값과 증감식을 사용하는 for문
public class Test11 {
	public static void main(String[] args) {

		int i, k;
		// 초깃값과 증감식을 2개씩 선언함
		for (i = 1, k = 1; i <= 9; i++, k++) {
			System.out.printf("%d X %d = %d \n", i, k, i*k);
		}
	}
}
