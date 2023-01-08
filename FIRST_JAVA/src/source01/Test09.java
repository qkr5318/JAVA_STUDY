package source01;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("임의의 정수를 입력해 주세요 ==> ");
		// -20을 입력하면 절대값으로 20이 출력되는 자바 프로그램 코딩해 봅니다.
		
		int a = scan.nextInt();
		int b = (a >= 0) ? a : -a;
		
		System.out.println(a + "의 절대값은 " + b + "입니다!");
		scan.close();
	}
}
