package source05;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 정수형 배열명 aa에 배열 요소 4개 메모리 공간을 생성하여 대입함
		int [] aa = new int[4];
		int hap = 0;
		
		System.out.print("첫번째 숫자를 입력해 주세요 ==> ");
		aa[0] = scan.nextInt();
		System.out.print("두번째 숫자를 입력해 주세요 ==> ");
		aa[1] = scan.nextInt();
		System.out.print("세번째 숫자를 입력해 주세요 ==> ");
		aa[2] = scan.nextInt();
		System.out.print("네번째 숫자를 입력해 주세요 ==> ");
		aa[3] = scan.nextInt();
		for (int i = 0; i < aa.length; i++) {
			hap += aa[i]; // hap = hap + aa[i];
		}
		System.out.printf("합계값 = %d \n", hap);
		scan.close();
	}
}
