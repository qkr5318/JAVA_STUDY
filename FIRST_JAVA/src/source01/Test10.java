package source01;

import java.util.Scanner;

// 학생 이름, 국어, 영어 점수를 입력 받아서 총점, 평균을 구하는 프로그램을 제작해 봅니다.

public class Test10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0, kor = 0, eng = 0;
		double avg = 0.00;
		
		System.out.print("학생의 이름을 입력해 주세요 ==> ");
		String name = scan.next();
		
		System.out.print("학생의 국어 점수를 입력해 주세요 ==> ");
		kor = scan.nextInt();
		
		System.out.print("학생의 영어 점수를 입력해 주세요 ==> ");
		eng = scan.nextInt();
		
		sum = kor + eng; // 총점 구하기
		avg = sum / 2.00; // 평균 구하기
		
		System.out.println(name + "학생의 총점은 " + sum + "점 입니다!");
		System.out.println(name + "학생의 평균은 " + avg + "점 입니다!");
		
		scan.close();
	}
}

//  실행 결과
//	학생의 이름을 입력해 주세요 ==> 장나라
//	학생의 국어 점수를 입력해 주세요 ==> 98
//	학생의 영어 점수를 입력해 주세요 ==> 94
//	장나라학생의 총점은 192점 입니다!
//	장나라학생의 평균은 96.0점 입니다!

