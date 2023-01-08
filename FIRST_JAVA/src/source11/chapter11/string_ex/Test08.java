package source11.chapter11.string_ex;

import java.util.Scanner;

// 문자열의 포함을 확인하는 contains() 메서드 활용 예시
public class Test08 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("문자열 포함 인증을 처리할 문자열을 입력 바랍니다 ==> ");
		String inputStr = scan.nextLine();
		
		String str = inputStr;
		System.out.println("원본 문자열 ==> " + str);
		
		if(str.contains("Java")) {
			System.out.println("인증이 성공 되셨습니다!");
		} else {
			System.out.println("인증이 되지 않았습니다!");
		}
	}
}


