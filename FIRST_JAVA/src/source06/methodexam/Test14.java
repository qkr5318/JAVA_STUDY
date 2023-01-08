package source06.methodexam;

import java.util.Scanner;

public class Test14 {
	
	public static boolean charCheck(String phone, char ch) {
		boolean tf = false;
		for (int i = 0; i < phone.length(); i++) {
			if(phone.charAt(i) == ch) {
				tf = true;
				break;
			}
		}
		return tf;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print(" - 문자를 빼고 핸드폰 번호를 입력해 주시기 바랍니다 ==> ");
		String phoneNum = scan.next();
		if(charCheck(phoneNum, '-')) {
			System.out.println(phoneNum + " 핸드폰 번호에 -이 포함되어 있습니다!");
			System.out.println("-은 제외하고 입력해 주시기 바랍니다.");
		} else {
			System.out.println("입력된 핸드폰 번호는 " + phoneNum + " 입니다!");
		}
		scan.close();
	}
}
