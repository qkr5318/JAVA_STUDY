package source11.chapter11.string_ex;

// 문자열의 각 문자를 charAt() 메서드를 이용해서 하나씩 출력하는 자바 프로그램을 제작해 봅니다!
public class Test05_02 {
	public static void main(String[] args) {

		String str = new String("Java");
		
		System.out.println(str.charAt(2)); // v
		System.out.println(str.length());  // 4
		
		System.out.println("원본 문자열 ==> " + str);
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.print("charAt() 메서드 호출 후 원본 문자열 = " + str);
	}
}

// 실행 결과
// 원본 문자열 ==> Java
// J
// a
// v
// a
// charAt() 메서드 호출 후 원본 문자열 = Java
