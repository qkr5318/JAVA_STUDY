package source02.chapter02;

import java.util.Scanner;

public class Test24_ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while (true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열 = \"" + inputData + "\"");
			if(inputData.equals("q")) {
				break;
			}			
		}	
		System.out.println("프로그램이 종료 되었습니다!");
	}	
}
