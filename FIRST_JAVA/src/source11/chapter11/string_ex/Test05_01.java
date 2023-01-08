package source11.chapter11.string_ex;

import java.util.Scanner;

// 문자열을 바꿔주는(대체해 주는) replace()
// 일부 문자열을 추출해 주는 substring()
// 문자열을 분리해 주는 split()

public class Test05_01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 입력 받을 원본 문자열(strOrigin), 대체할 문자열(strRep), 일부 추출 문자열(strSub), 분리한 문자열 배열(strArry[])을 선언합니다.
		String strOrigin, strRep, strSub, strArray[];
		System.out.print("8자 이상 문자열을 입력해 주시기 바랍니다 ==> ");
		strOrigin = scan.nextLine();
		
		// 원본 문자열(strOrigin) : Have a nice day~ ^-^/
		System.out.println("입력한 원본 문자열 = " + strOrigin);
		System.out.println("입력한 원본 문자열의 길이 = " + strOrigin.length()); // 21
		
		// 입력 원본 문자열의 공백을 $문자로 대체 표현해 봅니다!
		strRep = strOrigin.replace(" ", "$");
		System.out.println("공백은 $문자로 대체 표현한 문자열 표현 = " + strRep);
		
		// 입력 원본 문자열의 세번째부터 여덟번째 인덱스 미만까지 문자열을 추출해 봅니다!
		strSub = strOrigin.substring(3, 8);
		System.out.println("일부 추출 문자열 표현 = " + strSub);
		
		// 입력 원본 문자열의 공백을 기준으로 분리 처리해 봅니다!
		strArray = strOrigin.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("분리한 문자열 " + i + " = " + strArray[i]);
		}
	}
}

// 실행 결과
// 8자 이상 문자열을 입력해 주시기 바랍니다 ==> Have a nice day~ ^-^/
// 입력한 원본 문자열 = Have a nice day~ ^-^/
// 입력한 원본 문자열의 길이 = 21
// 공백은 $문자로 대체 표현한 문자열 표현 = Have$a$nice$day~$^-^/
// 일부 추출 문자열 표현 = e a n
// 분리한 문자열 0 = Have
// 분리한 문자열 1 = a
// 분리한 문자열 2 = nice
// 분리한 문자열 3 = day~
// 분리한 문자열 4 = ^-^/

