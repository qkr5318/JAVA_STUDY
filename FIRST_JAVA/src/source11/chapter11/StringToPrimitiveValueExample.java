package source11.chapter11;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {

		String str1 = "10";
		int value1 = Integer.parseInt(str1);
		System.out.println("value1 : " + value1);
		
		String str2 = "3.14";
		double value2 = Double.parseDouble(str2);
		System.out.println("value2 : " + value2);
		
		String str3 = "true";
		boolean value3 = Boolean.parseBoolean(str3);
		System.out.println("value3 : " + value3);
	}
}







