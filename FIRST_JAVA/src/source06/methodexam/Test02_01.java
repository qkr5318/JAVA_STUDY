package source06.methodexam;

public class Test02_01 {

	public static void main(String[] args) {

		int a = 10, b = 20;
		int c = sum(a, b);
		System.out.println("두 수의 합 = " + c);
	}

	public static int sum(int x, int y) {
		int z = 0;
		z = x + y;
		return z;
	}
}
