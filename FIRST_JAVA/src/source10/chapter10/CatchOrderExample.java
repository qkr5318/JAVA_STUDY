package source10.chapter10;

public class CatchOrderExample {
	public static void main(String[] args) {

		try {
			String data1 = args[0];
			String data2 = args[1];			
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다!");
		} catch (NumberFormatException e) {
			System.out.println("문자열 입력값에서 숫자를 파싱할 수가 없습니다!");
		} catch (Exception e) {
			System.out.println("실행에 문제가 있습니다!");
		} finally {
			System.out.println("예외가 발생하든, 발생하지 않든, 무조건 실행되는 finally 구문입니다!");
		}
	} 
}


