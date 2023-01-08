package source03.chpater03;

public class Test08_CompareOperatorExample {

	public static void main(String[] args) {

		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); // false
		System.out.println((float)v4 == v5);  // true
		
		String strVar1 = "장나라";
		String strVar2 = "장나라";
		System.out.println(strVar1.equals(strVar2)); // true
		System.out.println(!strVar1.equals(strVar2)); // false
		
		String engVar1 = "Jangnara";
		String engVar2 = "jangnara";
		System.out.println(engVar1.equals(engVar2)); // false
		System.out.println(engVar1.equalsIgnoreCase(engVar2)); // true		
	}
}
