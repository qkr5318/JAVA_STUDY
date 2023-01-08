package source11.chapter11.string_ex;

import java.util.Scanner;

// 공백 포함 문자열의 모든 공백을 없애는 자바 프로그램을 제작해 봅니다.
public class Test07 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("공백이 들어간 문자열을 입력해 주시기 바랍니다 ==> ");
		String inputStr = scan.nextLine(); // 문자열 입력 = " 한글 ABCD efgh "
		
		String str = inputStr;
		String result = "";
		
		System.out.println(str.length());
		
		// 문자열의 문자 개수만큼 반복 인덱싱을 수행합니다.
		for (int i = 0; i < str.length(); i++) {
			// 다음의 charAt(위치인덱스)는 해당 위치의 문자를 추출하고,
			// 이 문자가 공백이 아니라면 아래의 result 값에 덧붙여서 표현하게 합니다.
			if(str.charAt(i) != ' ') {
				result += str.substring(i, i+1);
			}
		}
		System.out.println("원본 문자열 ==> \n" + str);
		System.out.println("공백 제거 문자열 ==> \n" + result);
		scan.close();
	}
}
