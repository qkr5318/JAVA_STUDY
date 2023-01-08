package source04;

import java.util.Scanner;

// 두 정수를 입력 받아서, 두 수중에서 큰 값을 구하는 프로그램을 제작해 봅니다.
public class Test02_03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력해 주세요 ==> ");
		int num1 = scan.nextInt();
		System.out.print("두 번째 수를 입력해 주세요 ==> ");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println("첫 번째 입력값 " + num1 + "이 더 큽니다!");
		} else if(num1 == num2) {
			System.out.println("두 개의 입력값 " + num1 + ", " + num2 + " 값이 같습니다!");
		} else {
			System.out.println("두 번째 입력값 " + num2 + "이 더 큽니다!");
		}
		scan.close();
	}

}
