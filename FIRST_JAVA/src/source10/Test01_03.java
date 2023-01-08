package source10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01_03 {
	public static void main(String[] args) {

		int a, b, result;
		Scanner inputData = new Scanner(System.in);

		try {
			System.out.print("궁금하신 구구단값을 입력해 주세요 ==> ");
			a = inputData.nextInt();
			for (b = 1; b <= 9; b++) {
				result = a * b;
				System.out.printf("%d X %d = %d\n", a, b, result);
			}
			System.out.println("=============================");			
		} catch (InputMismatchException e) {
			System.out.println("고객님~ 정수로 입력을 부탁드립니다.");
		} finally {
			inputData.close();
		}
	}
}

