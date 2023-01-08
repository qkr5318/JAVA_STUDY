package source10.chapter10;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {

		String data1 = null;
		String data2 = null;
		
		try {			
			data1 = args[0];
			System.out.println("data1 = " + data1);
			data2 = args[1];
			System.out.println("data2 = " + data2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다!");
			return;
		}
		
		try {
			String str1 = "100";
			String str2 = "200";
			int value1 = Integer.parseInt(str1);
			int value2 = Integer.parseInt(str2);
			int result = value1 + value2;
			System.out.println(str1 + " + " + str2 + " = " + result);			
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다!");
		}		
		finally {
			System.out.println("이 부분은 예외가 처리가 되든, 안되든 실행되는 finally 구문의 실행 내용입니다!");
		}
	}
}
