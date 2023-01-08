package source11.chapter11.string_ex;

//두 문자열이 같은지 확인하는 == (메모리까지 비교), equals() (대소문자 구분 문자열 내용 비교)
//equalsIgnoreCase() (대소문자 구분하지 않고 문자열 내용 비교)
public class Test09 {
	public static void main(String[] args) {

		String str1 = "Java Programming";  
		System.out.println(str1.hashCode()); // 1377009627 
		System.out.println(System.identityHashCode(str1)); // 366712642 
		String str2 = "Java Programming";
		System.out.println(str2.hashCode()); // 1377009627
		System.out.println(System.identityHashCode(str2)); // 366712642
		String str3 = new String("Java Programming");
		System.out.println(str3.hashCode()); // 1377009627
		System.out.println(System.identityHashCode(str3)); // 1829164700
		
		// str1, str2, str3에 동일한 문자열을 저장합니다.
		// str3의 경우, new 연산자를 이용해서 문자열을 초기화 했는데,
		// 앞서, str1과 str2의 문자열 표현과 동일하게 나타나지만,
		// 힙 메모리 저장에서 차이가 있음을 고려해 주시기 바랍니다.	
		System.out.println("원본 문자열 1 = " + str1);
		System.out.println("원본 문자열 2 = " + str2);
		System.out.println("원본 문자열 3 = " + str3 + "\n");
		
		System.out.println("문자열 1 == 문자열 2 비교 결과 : " + (str1 == str2));
		System.out.println("문자열1.equals(문자열2) 비교 결과 : " + str1.equals(str2));
		
		System.out.println("문자열 1 == 문자열 3 비교 결과 : " + (str1 == str3));
		System.out.println("문자열1.equals(문자열3) 비교 결과 : " + str1.equals(str3));
		
		String str4 = "Java Programming";
		String str5 = "java programming";
		// equals() : 대소문자 구분 문자열 내용 비교
		System.out.println("문자열4.equals(문자열5) 비교 결과 : " + str4.equals(str5));
		// equalsIgnoreCase() : 대소문자 구분하지 않고 문자열 내용 비교
		System.out.println("문자열5.equalsIgnoreCase(문자열5) 비교 결과 : " + str4.equalsIgnoreCase(str5));
	}
}

// 실행 결과
// 1377009627
// 366712642
// 1377009627
// 366712642
// 1377009627
// 1829164700
// 원본 문자열 1 = Java Programming
// 원본 문자열 2 = Java Programming
// 원본 문자열 3 = Java Programming
//
// 문자열 1 == 문자열 2 비교 결과 : true
// 문자열1.equals(문자열2) 비교 결과 : true
// 문자열 1 == 문자열 3 비교 결과 : false
// 문자열1.equals(문자열3) 비교 결과 : true
// 문자열4.equals(문자열5) 비교 결과 : false
// 문자열5.equalsIgnoreCase(문자열5) 비교 결과 : true
