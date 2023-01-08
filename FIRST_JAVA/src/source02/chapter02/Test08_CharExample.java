package source02.chapter02;

public class Test08_CharExample {
	public static void main(String[] args) {
		char c1 = 'A';       // 문자를 직접 저장
		System.out.println("c1 = " + c1);  // c1 = A
		char c2 = 65;        // 10진수로 저장
		System.out.println("c2 = " + c2);  // c2 = A
		char c3 = '\u0041';  // 16진수로 저장		
		System.out.println("c3 = " + c3);  // c3 = A
		char c4 = '가';      // 문자를 직접 저장
		System.out.println("c4 = " + c4);  // c4 = 가
		char c5 = 44032;     // 10진수로 저장
		System.out.println("c5 = " + c5);  // c5 = 가
		char c6 = '\uac00';  // 16진수로 저장
		System.out.println("c6 = " + c6);  // c6 = 가
		char c7 = '\uC7A5';  // 16진수로 저장
		System.out.println("c7 = " + c7);  // c7 = 장
	}
}
