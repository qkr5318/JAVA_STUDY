package source06;

import java.util.Scanner;

class Method{
	int a = 10, b = 20; // 인스턴스 필드(인스턴스 멤버 변수)
	int multi() {       // 인스턴스 메서드(인스턴스 멤버 메서드)
		return a * b;
	}
	// static 메서드(class 메서드)
	static int multi(int x, int y) {
		return x * y;
	}
}

public class Test05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("곱셈의 첫번째 숫자를 입력해 주세요 ==> ");
		int num1 = scan.nextInt();
		System.out.print("곱셈의 두번째 숫자를 입력해 주세요 ==> ");
		int num2 = scan.nextInt();
	// static 메서드(class 메서드) multi(int x, int y) 호출
		int result = Method.multi(num1, num2);
		System.out.println("result = " + result);

		Method myMethod = new Method(); // 인스턴스 myMethod 생성
		System.out.println(myMethod.a); // 인스턴스 변수 a 호출
		System.out.println(myMethod.b); // 인스턴스 변수 b 호출
		// 인스턴스 메서드 multi() 호출
		System.out.println(myMethod.multi());		
	}
}
