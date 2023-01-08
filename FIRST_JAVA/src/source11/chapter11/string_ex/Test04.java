package source11.chapter11.string_ex;

// 특정 문자열의 위치를 찾는 indexOf(), lastIndexOf() 활용 예시

public class Test04 {
	public static void main(String[] args) {

		String str = "오늘은 즐거운 월요일 입니다! Have a nice day~ ^-^/";
		System.out.println("문자열 ===> " + str);
		System.out.println("문자열의 위치 갯수는 " + str.length() + "개 입니다!");
		
		System.out.print("제일 처음 나오는 a 글자의 위치 ==> ");
		
		// str 변수 문자열에서 "a"글자가 처음에 나오는 위치를 출력해 봅니다.
		System.out.println(str.indexOf("a")); // 인덱스 위치값 = 18 리턴해 줌
		
		System.out.print("마지막에 나오는 a 글자의 위치 ==> ");
		
		// str 변수 문자열에서 "a"글자가 마지막에 나오는 위치를 출력해 봅니다.
		System.out.println(str.lastIndexOf("a")); // 인덱스 위치값 = 30 리턴해 줌
		
		String strSearch = new String("Oracle Java!");
		System.out.println("\n원본 문자열 : " + strSearch); // 원본 문자열 : Oracle Java!
		
		// 소문자 o가 문자열 index에서 검색되지 않는다면 -1 값을 반환 처리함
		System.out.println(strSearch.indexOf('o')); // 소문자 o가 없다면 -1을 리턴함
		System.out.println(strSearch.indexOf('O')); // 대문자 O이 있다면 인덱스 위치가 0을 리턴함
		System.out.println(strSearch.indexOf('a')); // 소문자 a가 있다면 인덱스 위치가 2을 리턴함
		System.out.println(strSearch.indexOf("Java!")); // 문자열 Java!의 시작 인덱스 위치는 7을 리턴함		
	}
}



