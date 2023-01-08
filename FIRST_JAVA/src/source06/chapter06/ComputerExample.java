package source06.chapter06;

public class ComputerExample {

	public static void main(String[] args) {

		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3, 4, 5};
		int result1 = myCom.sum1(values1);
		System.out.println("result1 = " + result1);

		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5, 6});
		System.out.println("result2 = " + result2);
		
		int result3 = myCom.sum2(1, 2, 3, 4);
		System.out.println("result3 = " + result3);
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5, 6);
		System.out.println("result4 = " + result4);
	}
}
