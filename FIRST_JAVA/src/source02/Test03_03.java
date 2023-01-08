package source02;

import java.util.Scanner;

// 두 정수의 값을 입력 받아서 평균을 구하는 자바 프로그램을 제작해 보시기 바랍니다.
public class Test03_03 {
	public static void main(String[] args) {		
		
		int kor, eng;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해 주시기 바랍니다 ==> ");
		kor = scan.nextInt();
		
		System.out.print("영어 점수를 입력해 주시기 바랍니다 ==> ");
		eng = scan.nextInt();
		
		double avg = (kor + eng) / 2.00;
		System.out.println("국어 점수 = " + kor + ", 영어 점수 = " + eng);
		System.out.println("평균 점수 = " + avg);
		
		scan.close();
	}
}

//  실행 결과
//	국어 점수를 입력해 주시기 바랍니다 ==> 90
//	영어 점수를 입력해 주시기 바랍니다 ==> 88
//	국어 점수 = 90, 영어 점수 = 88
//	평균 점수 = 89.0
