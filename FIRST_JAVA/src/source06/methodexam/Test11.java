package source06.methodexam;

public class Test11 {
	
	public int summarize(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i; // sum = sum + i;
		}
		return sum;		
	}
		
	public static void main(String[] args) {

		int num1 = 10, num2 = 20, result = 0;
		
		Test11 m = new Test11();
		
		result = m.summarize(num1);
		System.out.println("1에서 10까지의 합 = " + result);
		
		result = m.summarize(num2);
		System.out.println("1에서 20까지의 합 = " + result);
		
		System.out.println("1에서 100까지의 합 = " + m.summarize(100));
	}
}
