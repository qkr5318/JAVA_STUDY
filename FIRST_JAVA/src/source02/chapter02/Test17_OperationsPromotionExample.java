package source02.chapter02;

public class Test17_OperationsPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println("intValue1 = " + intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int charValue3 = charValue1 + charValue2;
		System.out.println("유니코드 = " + charValue3);
		System.out.println("출력문자 = " + (char)charValue3);
		
		int intValue3 = 11;
		int intValue4 = intValue3/4;
		System.out.println("intValue4 = " + intValue4);
		
//		int intValue5 = 11 / (int)4.0;
//		System.out.println((int)4.0); // 4
		double intValue5 = 11 / 4.0;		
		System.out.println("intValue5 = " + intValue5);
		
		int x = 1;
		int y = 2;
//		double result = (double) x / y;
//		double result = x / (double) y;
		double result = (double) x / (double) y;
		System.out.println("result = " + result); // result = 0.5
	}
}
