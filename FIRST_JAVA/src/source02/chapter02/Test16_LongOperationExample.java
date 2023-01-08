package source02.chapter02;

public class Test16_LongOperationExample {

	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		System.out.println("result = " + result); // result = 1110
	}	
}
