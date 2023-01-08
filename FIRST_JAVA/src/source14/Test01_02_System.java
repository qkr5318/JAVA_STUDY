package source14;

public class Test01_02_System {

	public static void main(String[] args) {

		int a = 1234;
		float b = 100.12345f;
		char ch = 'K';
		String s = "JAVA Programming";
		
		// 정수를 10진수, 16진수, 8진수로 출력해 봅니다.
		System.out.printf("정수의 10진수 표현 = %d\n", a);
		System.out.printf("정수의 16진수 표현 = %x\n", a);
		System.out.printf("정수의 8진수 표현 = %o\n", a);
		
		// 실수를 일반 방식 및 공학용으로 출력해 봅니다.
		System.out.printf("실수 표현 = %10.3f\n", b);
		System.out.printf("실수(공학용) 표현 = %e\n", b);
		
		// 문자와 문자열을 출력해 봅니다.
		System.out.printf("문자 표현 = %c\n", ch);
		System.out.printf("문자열 표현 = %s\n", s);
	}
}


