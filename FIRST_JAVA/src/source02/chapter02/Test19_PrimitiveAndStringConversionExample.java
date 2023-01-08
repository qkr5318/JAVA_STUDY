package source02.chapter02;

public class Test19_PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		
		String s = "21";
		int value1 = Integer.parseInt(s);
		System.out.println("value1 = " + value1); // value1 = 21
		
		double value2 = Double.parseDouble(s);
		System.out.println("value2 = " + value2); // value2 = 21.0
		
		String tf = "true";
		boolean value3 = Boolean.parseBoolean(tf);
		System.out.println("value3 = " + value3); // value3 = true
		
		int num1 = 10;
		String str1 = String.valueOf(num1);
		System.out.println("str1 = " + str1); // str1 = 10
		
		double num2 = 3.14;
		String str2 = String.valueOf(num2);
		System.out.println("str2 = " + str2); // str2 = 3.14
		
		boolean tf2 = true;
		String str3 = String.valueOf(tf2);
		System.out.println("str3 = " + str3); // str3 = true
	}
}
