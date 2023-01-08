package source03.chpater03;

public class Test07_CompareOperatorExample1 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		System.out.println("result1 = " + result1);
		String answer = (num1 == num2) ? "맞아요" : "틀려요";
		System.out.println("answer = " + answer);
		boolean result2 = (num1 != num2);
		System.out.println("result2 = " + result2);
		boolean result3 = (num1 <= num2);
		System.out.println("result3 = " + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println("char1 = " + char1); // 'A'
		System.out.println("char1 = " + (int)char1); // 65
		System.out.println("char2 = " + char2); // 'B'
		System.out.println("char2 = " + (int)char2); // 66
		System.out.println("result4 = " + result4);
	}
}
