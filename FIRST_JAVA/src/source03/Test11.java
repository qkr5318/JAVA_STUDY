package source03;

public class Test11 {

	public static void main(String[] args) {

		int a = 2, b = 3, c = 4;
		int result1;
		float result2;
		
		result1 = a + b - c;
		System.out.printf("%d + %d - %d = %d \n", a, b, c, result1); // 1
		
		result1 = a + b * c;  
		System.out.printf("%d + %d * %d = %d \n", a, b, c, result1); // 14
		
		result2 = a * b / (float)c;
		System.out.printf("%d * %d / %d = %f\n", a, b, c, result2); // 1.500000
		
	}

}
