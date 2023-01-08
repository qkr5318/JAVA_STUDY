package source04.chapter04;

import java.util.Scanner;

public class Test02_IfElseExample {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력해 주시기 바랍니다 ==> ");
		int number = scan.nextInt();
		 
		int score = number;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다!");
			System.out.println("등급은 A입니다!");
		} else {
			System.out.println("점수가 90보다 작습니다!");
			System.out.println("등급은 B입니다!");
		}
		scan.close();
	}
}
