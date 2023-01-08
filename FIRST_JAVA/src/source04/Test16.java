package source04;

import java.util.Scanner;

// do ~ while문을 활용하여 메뉴값을 처리하는 자바 프로그램을 제작해 봅니다.

public class Test16 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int menu;
		do {
			System.out.print("\n손님 주문하시겠습니까?\n");
			System.out.print("<1>카페라떼 <2> 카푸치노 <3> 아메리카노 <4> 그만시킬래요 ==> ");
			menu = s.nextInt(); // 커피 종류를 선택해서 입력 받음
			switch (menu) {
			case 1:
				System.out.print("#카페라떼를 주문하셨습니다!\n");				
				break;
			case 2:
				System.out.print("#카푸치노를 주문하셨습니다!\n");				
				break;
			case 3:
				System.out.print("#아메리카노를 주문하셨습니다!\n");				
				break;
			case 4:
				System.out.print("#고객님. 주문 메뉴가 나오면 알려드리겠습니다. 감사합니다! \n");				
				break;
			default:
				System.out.print("잘못 주문하셨습니다! \n");
			}
		} 
		while(menu != 4);
	}
}
