package source11.chapter11.string_ex;

import java.util.Scanner;

// 특정 클래스의 main() 함수 내에서 "Java Programming"이라는 문자열을 생성하고,
// "gram" 문자열을 추출하여 화면에 출력하는 프로그램을 작성해 봅니다.

public class Test05_04 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력해 주시기 바랍니다 ==> ");
		String inputStr = scan.nextLine();
		System.out.print("입력 문자열에서 찾고 싶은 문자열을 입력해 주시기 바랍니다 ==> ");
		String inputFindStr = scan.next();
		
		String str = inputStr;
		String find_ch = inputFindStr;
		int find = str.indexOf(find_ch);
		System.out.println(find);  // 8
		System.out.println(find_ch.length());   // 4
		
		String res = str.substring(find, find+find_ch.length());
		System.out.println(res);
	}
}

