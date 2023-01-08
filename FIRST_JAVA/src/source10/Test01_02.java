package source10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01_02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("첫번째 정수를 입력해 주세요 ==> ");
			int n1 = scan.nextInt();
			System.out.print("두번째 정수를 입력해 주세요 ==> ");
			int n2 = scan.nextInt();
			int n3 = n1 / n2;
			System.out.println("첫번째 정수를 두번째 정수로 나눈 값 = " + n3);			
		} catch (ArithmeticException e) {
			System.out.println("고객님~ 0으로 나누기를 하시면 안됩니다!");
		} catch (InputMismatchException e) {
			System.out.println("고객님~ 정수로 입력을 부탁드립니다!");
		} catch (Exception e) {
			System.out.println("예외가 발생하였습니다!");
		}		
		finally { // 예외가 발생하든, 안하든 무조건 수행되는 finally 구문임
			System.out.println("프로그램이 종료 되었습니다!");
		}				
	}
}

