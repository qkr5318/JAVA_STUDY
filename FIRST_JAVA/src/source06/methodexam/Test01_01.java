package source06.methodexam;

// 메서드를 이용하지 않은 예
public class Test01_01 {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i; // sum = sum + i
		}

		System.out.println("합(1~10) : " + sum);

		sum = 0;
		for(int i = 10; i <= 100; i++) {
			sum += i; // sum = sum + i;
		}
		
		System.out.println("합(10~100) : " + sum);
		
		sum = 0;
		for(int i = 100; i <= 1000; i++) {
			sum += i; // sum = sum + i;
		}
		
		System.out.println("합(100~1000) : " + sum);;

	}
}

/* 결과 화면
합(1~10) : 55
합(10~100) : 5005
합(100~1000) : 495550 */
