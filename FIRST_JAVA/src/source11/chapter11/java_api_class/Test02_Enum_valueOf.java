package source11.chapter11.java_api_class;

/* 
※ 열거형(Enumeration Type)
C언어와 C++에서는 열거형을 사용할 수 있지만, JDK 1.5 이전의 자바에서는
열거형을 사용할 수 없었습니다. 하지만 JDK 1.5부터는 C언어의 열거형보다 더욱 향상된 성능의
열거형을 정의한 Enum 클래스를 사용할 수 있습니다. 즉, 열거형은 연관된 항목을 묶어서 표현할 수 있는 타입이다. */

/* 자바의 열거형은 다음과 같은 장점을 가집니다.
1. 열거형을 비교할 때 실제 값뿐만 아니라 타입까지도 체크합니다.
2. 열거형을 상숫값이 재정의되더라도 다시 컴파일할 필요가 없습니다.
3. java.lang.Enum 클래스
   Enum 클래스는 모든 자바 열거형을의 공통된 조상 클래스입니다.
   Enum 클래스에는 열거형을를 조작하기 위한 다양한 메소드가 포함되어 있습니다.
4. values() 메소드
   values() 메소드는 해당 열거형을의 모든 상수를 저장한 배열을 생성하여 반환합니다.
   이 메소드는 자바의 모든 열거형을에 컴파일러가 자동으로 추가해 주는 메소드입니다.
5. valueOf() 메소드
   valueOf() 메소드는 전달된 문자열과 일치하는 해당 열거형의 상수를 반환합니다.
*/

enum Rainbow {RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET}

public class Test02_Enum_valueOf {
	public static void main(String[] args) {

		Rainbow [] arr = Rainbow.values();
		
		for (Rainbow rb : arr) {
			System.out.println(rb);
		}
		
		System.out.println("===========================");
		Rainbow rb1 = Rainbow.valueOf("GREEN");
		System.out.println(rb1);
	}
}


