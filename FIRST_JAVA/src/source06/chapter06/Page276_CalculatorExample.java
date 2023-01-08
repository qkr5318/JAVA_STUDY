package source06.chapter06;

public class Page276_CalculatorExample {

	public static void main(String[] args) {

		Page276_Calculator myCalc = new Page276_Calculator();
		System.out.println(myCalc.pi);		
		
		double result1 = 10 * 10 * Page276_Calculator.pi;
		System.out.println("result1 = " + result1);
		int result2 = Page276_Calculator.plus(10, 5);
		System.out.println("result2 = " + result2);
		int result3 = Page276_Calculator.minus(10, 5);
		System.out.println("result3 = " + result3);
	}
}
