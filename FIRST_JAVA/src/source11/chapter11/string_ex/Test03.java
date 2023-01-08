package source11.chapter11.string_ex;

import java.util.Scanner;

// 문자열의 처음 또는 끝이 특정 문자열인지 확인하는
// startsWith(), endsWith() 활용 예시
// 리턴값은 논리형의 true와 false 입니다.

public class Test03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str;
		
		System.out.print("문자열을 입력해 주시기 바랍니다 ==> ");
		str = scan.nextLine();
		
		System.out.print("출력 문자열 ===> ");
		System.out.println(str);
		
		// 입력 문자열의 시작이 ( 가 아니면 ( 를 넣어서 출력하게 합니다.
		if(!str.startsWith("(")){
			System.out.print("(");
		} // 그외에 입력한 문자열을 모두 출력해 줍니다.
		for (int i = 0; i < str.length(); i++) {
			System.out.printf("%c", str.charAt(i));
		}
		// 입력 문자열의 마지막이 ) 가 아니면 ) 를 넣어저 출력하게 합니다.
		if(!str.endsWith(")")){
			System.out.print(")");
		} 
	}
}
