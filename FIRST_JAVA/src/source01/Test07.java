package source01;

import java.util.Scanner;

// 좋아하는 이름과 숫자를 입력 받아서 출력하는 자바 프로그램을 제작해 봅니다.
public class Test07 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("좋아하는 이름을 입력해 주세요 ==> ");
		String name = scan.next();
		System.out.println("좋아하는 숫자를 입력해 주세요 ==> ");
		int num = scan.nextInt();
		
		System.out.println("좋아하는 이름 = " + name + " 이고, " + "숫자는  " + num + "입니다!");
		scan.close();
	}
}
