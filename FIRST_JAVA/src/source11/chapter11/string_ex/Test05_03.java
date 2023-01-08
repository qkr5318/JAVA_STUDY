package source11.chapter11.string_ex;

/* concat() 메소드는 해당 문자열의 뒤에 인수로 전달된 문자열을 추가한 새로운 문자열을 반환합니다.
만약 인수로 전달된 문자열의 길이가 0이면, 해당 문자열을 그대로 반환합니다 */
public class Test05_03 {
	public static void main(String[] args) {

		String str = new String("Java");
		System.out.println("원본 문자열 = " + str); // 원본 문자열 = Java
		
		System.out.println(str.concat(" 수업!")); // Java 수업!
		
		String str2 = str.concat(" Programming!");
		System.out.println("concat() 메서드 호출 후 원본 문자열 = " + str2);
	}
}

// 실행 결과
// 원본 문자열 = Java
// Java 수업!
// concat() 메서드 호출 후 원본 문자열 = Java Programming!
