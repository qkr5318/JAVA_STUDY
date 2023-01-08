package source06.methodexam;

public class Test02_03 {

	public void print(int a) {
		System.out.println("결과 값 = " + a);
	}
	
	public static void main(String[] args) {

		int a = 11, b = 22, result = 0;
		
		Test02_03 m = new Test02_03();
		result = a + b;
		
		m.print(10); // 결과 값 = 11
		m.print(b);  // 결과 값 = 22
		m.print(result); // 결과 값 = 33
	}
}
