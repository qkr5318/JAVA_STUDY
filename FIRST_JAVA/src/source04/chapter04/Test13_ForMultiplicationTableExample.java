package source04.chapter04;

import java.util.Scanner;

public class Test13_ForMultiplicationTableExample {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("화면 출력을 원하시는 단을 입력해 주세요 ==> ");
		int dan = scan.nextInt();
		
		for (int m = dan; m <= dan; m++) { // 바깥쪽 for문
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) { // 중첩 for문
				System.out.println(m + " X " + n + " = " + (m*n));						
			}
		}
	}
}
