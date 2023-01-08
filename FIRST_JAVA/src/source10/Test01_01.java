package source10;

import java.util.Scanner;

public class Test01_01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("첫번째 수를 입력해 주세요 ==> ");
			int n1 = scan.nextInt();
			System.out.print("두번째 수를 입력해 주세요 ==> ");
			int n2 = scan.nextInt();
			try {
				int n3 = n1/n2;
				System.out.println(n1 + " / " + n2 + " = " + n3);				
			} catch (ArithmeticException e) {
				System.out.println("고객님~ 0으로 나눌수는 없습니다~");
				System.out.println("오류 메시지 = " + e.getMessage());
			}
			System.out.print("계속 할까요? yes 또는 no를 입력해 주세요 ==> ");
			String message = scan.next();
			if(message.equals("no")||message.equals("NO")) {
				System.out.println("프로그램이 종료 되었습니다!");
				break;
			}
		}
	}
}


