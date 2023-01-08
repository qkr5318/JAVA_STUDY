package source03;

public class Test08 {
	public static void main(String[] args) {

		int a = 10;
		int b = 7;
		int c = 10;
		int d = 7;
		
		int e = a&b;
		System.out.println("정수형 변수 e의 값 = " + e); // 2
		int f = c|d;
		System.out.println("정수형 변수 f의 값 = " + f); // 15
		int g = e^f; // ^(XOR) 연산(배타적 논리합 연산)
		System.out.println("정수형 변수 g의 값 = " + g); // 13
		int h = ~g;  // ~ (Tilde) NOT 연산
		System.out.println("정수형 변수 h의 값 = " + h); // -14
	}

}
