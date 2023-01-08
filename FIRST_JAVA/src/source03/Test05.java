package source03;

public class Test05 {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;
		int x = 2;
		
		int num1, num2, num3, num4;
		
		num1 = ++a + x;  // ++a = 11, x = 2
		System.out.println("num1 = " + num1); // 13
		
		num2 = b++ + x; // b++ = 10, x = 2
		System.out.println("num2 = " + num2); // 12

		num3 = --c + x; // --c = 9, x = 2
		System.out.println("num3 = " + num3); // 11
		
		num4 = d-- + x; // d-- = 10, x = 2
		System.out.println("num4 = " + num4); // 12		
	}
}
