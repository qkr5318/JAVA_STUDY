package source11.chapter11.string_ex;

// length() 메서드 사용
public class Test01 {
	public static void main(String[] args) {
		String str = "Hello Java";
		
		int len;
		
		len = str.length();
		
		System.out.printf("문자열 = %s\n", str);
		// length() 메서드 활용 문자열 길이를 출력합니다.
		System.out.printf("문자열 길이 = %d", len);
	}
}

