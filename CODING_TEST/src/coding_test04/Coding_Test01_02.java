package coding_test04;

//while문을 활용하여, 다음 실행 결과와 같이
//1부터 5까지 곱을 구하는
//자바 프로그램을 제작해 봅니다.
//실행 결과 : 1부터 5까지의 곱 = 120

public class Coding_Test01_02{
	public static void main(String[] args) {
		int sum = 1;
		
		while (sum <= 120) {
			for (int i = 1; i <=5 ; i++) {
				
				sum *= i;
			}
		
		
			System.out.println(sum);
			break;
		}
		
		
	}
}