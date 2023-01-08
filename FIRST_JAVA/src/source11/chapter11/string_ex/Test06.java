package source11.chapter11.string_ex;

//대문자를 소문자로 변환해서 표현하는 toLowerCase() 메서드
//소문자를 대문자로 변환해서 표현하는 toUpperCase() 메서드
//문자열의 앞과 뒤의 공백을 제거한 후 문자열을 반환하는 trim() 메서드
public class Test06 {
	public static void main(String[] args) {

		String str = " 한글 ABCD efgh ";
		System.out.print("원본 문자열 ==> \n" + str);
		
		System.out.println("\n" + str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());		
	}
}


