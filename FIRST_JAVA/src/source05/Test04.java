package source05;

import java.util.Scanner;

// 배열의 크기 = 정수 5개를 입력하면 평균값이 화면에 출력되는
// 자바 프로그램을 제작해 봅니다.
public class Test04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int scores[] = new int[5];
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("숫자를 입력해 주시기 바랍니다 ==> ");
			scores[i] = in.nextInt();			
		}
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("입력된 5개 배열 요소값들의 합계값 = " + sum);
		System.out.printf("입력된 5개 배열 요소값들의 평균값 = %.1f", (sum / (float)scores.length));
		in.close();
	}
}



