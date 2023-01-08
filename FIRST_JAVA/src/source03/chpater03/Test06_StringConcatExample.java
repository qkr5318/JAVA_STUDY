package source03.chpater03;

public class Test06_StringConcatExample {

	public static void main(String[] args) {
		
		String str1 = "JDK" + 8.0;
		System.out.println("str1 = " + str1);
		String str2 = str1 + " 특징!";
		System.out.println("str2 = " + str2);
		String str3 = "JDK" + 3 + 3.0;
		System.out.println("str3 = " + str3);
		String str4 = 3 + 3.0 + "JDK";
		System.out.println("str4 = " + str4);
	}
}
