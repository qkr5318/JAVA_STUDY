package source04;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("희망 상품을 TV, 자동차, 컴퓨터 중에서 입력해 주시기 바랍니다 ==> ");
		String product = scan.next();
		switch (product) {
		case "TV":
			System.out.println("상품은 TV 입니다!");
			break;
		case "자동차":
			System.out.println("상품은 자동차 입니다!");
			break;
		case "컴퓨터":
			System.out.println("상품은 컴퓨터 입니다!");
			break;
		default:
			System.out.println("희망하시는 상품은 없습니다!");
			break;
		}
		scan.close();
	}

}
