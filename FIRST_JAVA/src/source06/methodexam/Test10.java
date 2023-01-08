package source06.methodexam;

public class Test10 {
	
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}	
	
	public static void main(String[] args) {

		int num1 = 10, num2 = 20, result = 0;
		
		Test10 m = new Test10();
		
		result = m.add(num1, num2);
		
		System.out.println("두 수의 합 = " + result);
		System.out.println("두 수의 합 = " + m.add(100,  300));		
	}

}
