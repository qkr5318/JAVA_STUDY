package coding_test02;

import java.util.Scanner;

// operator 값이 +, -, *, / 인 경우에
// 사칙 연산을 수행하는 프로그램을 if-else if문을
// 사용해서 구현해 보시기 바랍니다.
// int num1 = 10;
// int num2 = 2;
// char operator = '+';

public class Coding_Test01_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 연산 숫자를 입력해 주시기 바랍니다==> ");
		int num1 = scan.nextInt();
		System.out.println("두번째 연산 숫자를 입력해 주시기 바랍니다==> ");
		int num2 = scan.nextInt();
		System.out.println("+, -, *, / 중에서 연산 기호 한가지를 입력해 주시기 바랍니다==> ");
		char str =  scan.next().charAt(0);
		char operator = str;
//		char str =  scan.next().charAt(0);
//		char operator = str;
		
		int result = 0;
		if (operator == '+') {
		 result = num1 + num2;
		}else if (operator == '-') {
			 result = num1 - num2;
		}else if (operator == '*') {
			 result = num1 * num2;
		}else if (operator == '/') {
			 result = num1 / num2;
		}else {
			System.out.println("연산자 오류입니다.");
			return;
		}
		System.out.println("결과 값은" + result + " 입니다.");
		scan.close();
	}
}