package source06;

import java.util.Scanner;

public class Test01_01 {

	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;		
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		int sum = 0;
		int i;
		for (i = 0; i <= 10; i++) {
			sum += i; // sum = sum + i;
		}
		return sum;
	}
	

	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		System.out.print("하고 싶은 말을 써주세요 ==> ");
		String str = scan.nextLine();		
		sayHello(str);
		
		System.out.print("더하고 싶은 첫번째 숫자를 입력해 주세요 ==> ");
		int num1 = scan.nextInt();
		System.out.print("더하고 싶은 두번째 숫자를 입력해 주세요 ==> ");
		int num2 = scan.nextInt();
		
//		int n1 = 10;
//		int n2 = 20;
		
		int total = addNum(num1, num2);
		System.out.println("total값 = " + total);
		
		int num = calcSum();
		System.out.println("calcSum() 메서드 결과값 = " + num);		
	}
}
