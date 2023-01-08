package source04;

import java.util.Scanner;

//Scanner 클래스 활용 "구구단"의 "단"을 입력 받아서
//for문 활용 구구단을 화면으로 출력하는 자바 프로그램을
//제작해 보시기 바랍니다. (파일명 : Test09_Gugudan.java)
public class Test09_Gugudan {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int dan;
		int times;
		
		System.out.print("보고 싶은 구구단의 단을 입력해 주세요 ==> ");
		dan = scan.nextInt(); // 구구단으로 보여줄 단값을 입력 받음
		
		for (times = 1; times <= 9; times++) {
			System.out.printf("%d X %d = %2d \n", dan, times, dan*times);
			scan.close();		
		}
	}
}
