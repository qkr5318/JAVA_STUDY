package source02.chapter02;

// 자동 타입 변환(묵시적/암시적 형변환 : Implicit type casting)
// byte < short < int < long < float < double 
//         char < int < long < float < double
public class Test13_PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue = " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 = " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue = " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.err.println("floatValue = " + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue = " + doubleValue);
	} 	
}
