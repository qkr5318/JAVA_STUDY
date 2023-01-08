package source05;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int [] aa = new int[4];
		int hap = 0, i;
		
		// Enhanced for문(향상된 for문 : for each문)
		for (int input : aa) {
			System.out.print("차례대로 네개의 숫자를 입력해 주세요 ==> ");
			input = s.nextInt();
			hap += input; // hap = hap + input;
		}
		
//		for (i = 0; i < aa.length; i++) {
//			System.out.printf("%d번째 숫자를 입력해 주세요 ==> ", i+1);
//			aa[i] = s.nextInt();
//			hap += aa[i]; // hap = hap + aa[i];
//		}
		System.out.printf("합계값 = %d \n", hap);
		s.close();		
	}
}
