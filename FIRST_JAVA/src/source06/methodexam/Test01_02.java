package source06.methodexam;

/* 메서드를 이용한 예제 : 메서드를 이용하면 얻을 수 있는 장점
1) 중복 코드를 줄이고 코드를 재사용할 수 있다. 
2) 코드를 모듈화해 가독성을 높이므로 프로그램의 품질을 향상시킨다. */
public class Test01_02 {
	public static void main(String[] args) {
		
		System.out.println("합(1~10) : " + sum(1, 10));
		System.out.println("합(10~100) : " + sum(10, 100));
		System.out.println("합(100~1000) : " + sum(100, 1000));
	}

	public static int sum(int num1, int num2) {
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum += i; // sum = sum + i;
		}
		return sum;
	}
}
