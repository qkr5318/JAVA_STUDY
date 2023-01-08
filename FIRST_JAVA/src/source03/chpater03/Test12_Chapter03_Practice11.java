package source03.chpater03;

import java.util.Scanner;

//키보드로 아이디와 패스워드를 입력받습니다.
//입력 조건으로 이름은 문자열이고, 패스워드는 정수입니다(패스워드는 int 타입으로 변환).
//입력된 내용을 비교해서 아이디가 "java"이고, 패스워드가 12345라면 "로그인 성공"을 출력하고,
//그렇지 않으면 "로그인 실패"를 출력하도록 자바 프로그램을 작성해 보시기 바랍니다.
public class Test12_Chapter03_Practice11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디:");
		String name = scanner.nextLine();
		
		System.out.print("패스워드:");
		String strPassword = scanner.nextLine();
		
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공!");
			} else {
				System.out.println("로그인 실패: 패스워드가 틀림!");
			}
		} else {
			System.out.println("로그인 실패: 아이디가 존재하지 않음!");
		}
		scanner.close();
	}
}
