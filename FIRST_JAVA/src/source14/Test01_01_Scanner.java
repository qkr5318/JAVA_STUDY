package source14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test01_01_Scanner {
	public static void main(String[] args) throws FileNotFoundException {

//		Scanner scan = new Scanner(System.in);
//		System.out.print("화면에 표시하고 싶은 문자열을 입력해 주세요 ==> ");
//		String inputStr = scan.nextLine();
//		System.out.println(inputStr);

		// 입력 문자열에서 / 구분 문자로 나누어서 문자열 표현하기
//		Scanner scan = new Scanner(System.in);
//		System.out.print("화면에 표시하고 싶은 문자열을 입력해 주세요 ==> ");
//		String inputStr = scan.nextLine();
//		Scanner lineOut = new Scanner(inputStr);
//		lineOut.useDelimiter("/"); // Delimiter : 구분 문자
//		
//		while (lineOut.hasNext()) {
//			String string = (String) lineOut.next();
//			System.out.println(string);
//		}
		
//		Scanner scan = new Scanner("김연아/여성/30대");
//		String inputStr = scan.nextLine();
//		Scanner lineOut = new Scanner(inputStr);
//		lineOut.useDelimiter("/"); // Delimiter : 구분 문자
//		
//		while (lineOut.hasNext()) {
//			String string = (String) lineOut.next();
//			System.out.println(string);
//		}
		
		Scanner scan = new Scanner(new File("C:/Test/scanner.txt"));
		String inputStr = scan.nextLine();
		Scanner lineOut = new Scanner(inputStr);
		lineOut.useDelimiter("/"); // Delimiter : 구분 문자
		
		while (lineOut.hasNext()) {
			String string = (String) lineOut.next();
			System.out.println(string);
		}		
		
	}
}



