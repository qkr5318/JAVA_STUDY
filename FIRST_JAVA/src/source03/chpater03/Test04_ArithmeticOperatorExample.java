package source03.chpater03;

public class Test04_ArithmeticOperatorExample {

	public static void main(String[] args) {

		int v1 = 5;
		int v2 = 2;
		
		int reslut1 = v1 + v2;
		System.out.println("result1 = " + reslut1);
		
		int reslut2 = v1 - v2;
		System.out.println("result2 = " + reslut2);

		int reslut3 = v1 * v2;
		System.out.println("result3 = " + reslut3);
		
		int reslut4 = v1 / v2;
		System.out.println("result4 = " + reslut4); // 2

		int reslut5 = v1 % v2;
		System.out.println("result5 = " + reslut5);
		
		double reslut6 = (double)v1 / v2;
		System.out.println("result6 = " + reslut6); // 2.5
	}

}
