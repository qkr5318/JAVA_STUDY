package source06.methodexam;

public class Test02_02 {

	
	public void print() {
		System.out.println("return 타입이 없는 void형의 print() 메서드를 호출합니다!");
	}
	public static void main(String[] args) {

		int a = 1, b = 2;
		int result = 0;
		
		result = a + b;
		System.out.println("result = " + result);
		
		Test02_02 method = new Test02_02();
		method.print();		
	}
}
