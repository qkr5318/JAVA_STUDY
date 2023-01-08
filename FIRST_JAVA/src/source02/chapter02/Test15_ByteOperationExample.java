package source02.chapter02;

public class Test15_ByteOperationExample {
	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println("result1 = " + result1);
		
		byte x = 10;
		byte y = 20;
		// 컴파일 에러(x + y 변수 연산 시 int 연산 처리 되기 때문에 발생함)
//		byte result2 = x + y;
		int result2 = x + y;		
		System.out.println("result2 = " + result2);
	}
}
