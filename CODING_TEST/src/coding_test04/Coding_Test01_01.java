package coding_test04;

//while문을 활용하여, 다음 실행 결과와 같이
//1부터 5까지 합을 구하는
//자바 프로그램을 제작해 봅니다.
//실행 결과 : 1부터 5까지의 합 = 15

public class Coding_Test01_01{
	public static void main(String[] args) {
		
		int sum = 0;
		
		while (true) {
			for (int i = 1; i <= 5 ; i++) {
				sum +=  i;
			}
			System.out.println(sum);
			break;
		}
		
		
		
		
		
		
		
	}
}