package source11.chapter11;

public class StringValueOfExample {
	public static void main(String[] args) {

		int num1 = 10;
		String str1 = String.valueOf(num1);
		System.out.println(str1);  // int 10 -> String "10"
		double num2 = 10.5;
		String str2 = String.valueOf(num2); // double 10.5 -> String "10.5"
		System.out.println(str2);
		boolean tf = true;
		String str3 = String.valueOf(tf); // boolean true -> String "true"
		System.out.println(str3);
		System.out.println(str3.getClass().getName());		
	}
}


