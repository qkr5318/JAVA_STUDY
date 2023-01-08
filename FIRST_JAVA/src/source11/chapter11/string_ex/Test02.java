package source11.chapter11.string_ex;

import java.util.Scanner;

// length() 메서드 활용 예시
public class Test02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str;
		
		System.out.print("문자열을 입력해 주세요 ==> ");  
		str = scan.nextLine();
		
		System.out.print("출력 문자열 ==> ");		
		System.out.println(str); // original
		
		// 문자열 내용 중에 o라는 영문자가 있다면 $으로 대체해서 출력하고,
		// 그렇지 않을 경우, 원래 문자를 출력하는 자바 프로그램을 제작해 봅니다.
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'o') {
				System.out.printf("o 영문자가 대체된 문자열 = %c", '$');
			} else {
				System.out.printf("%c", str.charAt(i));
			}
		}
	}
}

// 실행 결과
// 문자열을 입력해 주세요 ==> original
// 출력 문자열 ==> original
// o 영문자가 대체된 문자열 = $riginal
