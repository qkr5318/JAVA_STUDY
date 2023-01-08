package source04.chapter04;

public class Test11_ForSumFrom1To100Example1 {
	public static void main(String[] args) {

		int sum = 0;
		
		int i = 0;
		
		for (i = 1; i <= 100; i++) {
			sum += i;  // sum = sum + i;
//			System.out.println(i);
		}
		System.out.println("1 ~ " + (i-1) + " 합 = " + sum);
	}
}
