package source02.chapter02;

// 강제 형변환(명시적 형변환 : Explicit Conversion 또는 Demotion
// 또는 Downcasting)을 명시적 형변환이라고도 말합니다.
// 강제 형변환은 캐스팅 연산자 괄호 ()를 사용합니다.
// 이때, 괄호 안에 들어가는 타입은 나누는 단위입니다.
public class Test14_CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println("charValue = " + charValue); // charValue = 가
		
		long longValue = 500;
		intValue = (int) longValue; 
		System.out.println("intValue = " + intValue); // intValue = 500
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println("intValue = " + intValue); // intValue = 3
	}
}
