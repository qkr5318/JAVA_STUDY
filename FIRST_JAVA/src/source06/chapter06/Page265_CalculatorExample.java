package source06.chapter06;

public class Page265_CalculatorExample {

	public static void main(String[] args) {

		Page265_Calculator myCalcu = new Page265_Calculator();
		
		// 정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		System.out.println("정사각형의 넓이 = " + result1);
		
		// 직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10, 20);
		System.out.println("직사각형의 넓이 = " + result2);
	}
}
