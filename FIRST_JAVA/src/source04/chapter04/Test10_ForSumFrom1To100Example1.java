package source04.chapter04;

public class Test10_ForSumFrom1To100Example1 {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int i = 0; i <= 100; i++) {
			sum += i;  // sum = sum + i;
//			System.out.println(i);
		}
		System.out.println("1 ~ 100까지 합 = " + sum);
	}
}
