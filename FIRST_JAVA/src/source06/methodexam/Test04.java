package source06.methodexam;

import java.util.Scanner;

// 메서드의 매개변수(Parameter, 파라미터) 활용 예시
public class Test04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("화면에 출력하고 싶은 문자열을 입력해 주세요 ==> ");
		String inputStr = scan.nextLine();
		System.out.print("화면에 반복 출력하고 싶은 횟수를 입력해 주세요 ==> ");
		int inputNum = scan.nextInt();
		
		echo(inputStr, inputNum);		
	}

	public static void echo(String str, int num) {
		for (int i = 0; i < num; i++) {
			System.out.println(str);
		}
	}
}
