package source06.methodexam;

import java.util.Scanner;

// Scanner 클래스 활용 두 수를 입력 받아서 합계값을 출력하는 자바 프로그램을 제작해 보시기 바랍니다. 
public class Test07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해 주시기 바랍니다 ==> ");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력해 주시기 바랍니다 ==> ");
		int num2 = scan.nextInt();
		
		int hap;
		
		hap = plus(num1, num2);
		System.out.printf("%d과 %d의 plus() 메서드 결과값 = %d\n", num1, num2, hap);
	}
	public static int plus(int i, int j) {
		int result;
		result = i + j;
		return result;
	}
}
