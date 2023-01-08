package source06.methodexam;

import java.util.Scanner;

public class Test02_04 {
	
	public void print(double a, double b) {
		double c = a + b;
		System.out.println("결과 값 = " + c);
	}
	
	public void printMessage(String message) {
		System.out.println("화면 출력 메시지 = " + message);
	}	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("화면에 출력하고 싶은 문자열을 입력해 주시기 바랍니다 ==> ");
		String str = scan.nextLine();
		System.out.print("덧셈을 희망하는 첫번째 수를 입력해 주시기 바랍니다 ==> ");
		double num1 = scan.nextDouble();
		System.out.print("덧셈을 희망하는 두번째 수를 입력해 주시기 바랍니다 ==> ");
		double num2 = scan.nextDouble();
		
		Test02_04 m = new Test02_04();
		m.printMessage(str);
		m.print(num1, num2);
	}
}
