package source01;

import java.util.Scanner;

// 두 정수를 입력 받아서, 조건 연산자를 이용해서 큰 값을 구해서
// 출력해 보는 자바 프로그램을 제작해 봅니다.

public class Test08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 비교 숫자를 입력해 주세요 ==> ");
		int a = scan.nextInt();
		
		System.out.println("두번째 비교 숫자를 입력해 주세요 ==> ");
		int b = scan.nextInt();
		
		int c = (a>b) ? a : b;
		
		System.out.println("입력하신 두 수 " + a + " 와 " + b + " 중에서 큰 값은 " + c + " 입니다!");
		
		scan.close();	
	}
}
