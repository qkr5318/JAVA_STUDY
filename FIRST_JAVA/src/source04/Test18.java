package source04;

// 1부터 100까지 숫자 중에서 3의 배수값을 출력하고 3의 배수합도 출력하는
// 자바 프로그램을 제작해 봅니다.
public class Test18 {
	public static void main(String[] args) {

		int i = 1, sum = 0;
		do {
			if(i%3 == 0) {
				System.out.print(i + " ");
				sum += i; // sum = sum + i;
			}
			i++;			
		} while(i <= 100);
		System.out.println();
		System.out.println("1부터 100까지 3의 배수값들의 합 = " + sum);
	}
}
