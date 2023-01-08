package source10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {

		String [] str = {"장나라", "김희선", "이영애", "김다미", "전지현"};
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("몇번 학생의 이름을 출력해 드릴까요? (종료 = 0)");
			try {
				int n = scan.nextInt();
				if (n==0) {
					System.out.println("프로그램이 종료 되었습니다!");
					break;
				}
				String s = str[n-1];
				System.out.println(n + "번 학생의 이름은 " + s + " 입니다!");	
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("1번부터 5번까지 학생 번호만 입력해 주시기 바랍니다!");
				continue;
			} catch (InputMismatchException e) {
				System.out.println("고객님~ 정수값을 입력해 주시기 바랍니다!");
//				scan.next();  // 문자열형 체크
				scan.nextDouble();  // 실수형 체크
				continue;
			}
		}		
	}
}
