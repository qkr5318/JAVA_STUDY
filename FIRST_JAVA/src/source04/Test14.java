package source04;

// 1부터 100까지 숫자 중에서 3의 배수값을 출력하고 3의 배수합도 출력하는
// 자바 프로그램을 제작해 봅니다.
public class Test14 {
	public static void main(String[] args) {
		int a = 1, sum = 0;
		while (a <= 100) {
			if(a % 3 == 0) {
				System.out.print(a + " ");
				sum += a;  // sum = sum + a;
			}
			a++;
		}
		System.out.print("\n");
		System.out.printf("1부터 100까지 숫자 중에서 3의 배수값들의 합 = %d \n", sum);	
	}
}
