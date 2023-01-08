package source11.chapter11;

// 문자열을 String 클래스의 replace() 메서드를 활용해서 대체 처리하는 자바 프로그램을 제작합니다!
public class StringReplaceExample {
	public static void main(String[] args) {

		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		System.out.println(oldStr);
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(newStr);		
	}
}


