package source02.chapter02;

public class Test03_VariableExchangeExample {

	public static void main(String[] args) {

		int x = 20;
		int y = 15;
		System.out.println("x = " + x + ", y = " + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x = " + x + ", y = " + y);
	}
}
