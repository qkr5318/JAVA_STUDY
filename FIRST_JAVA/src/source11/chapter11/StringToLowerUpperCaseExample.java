package source11.chapter11;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {

		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));  // false
		System.out.println(str1.equalsIgnoreCase(str2));  // true
		
		String lowerStr = str1.toLowerCase();
		System.out.println(lowerStr); // java programming
		System.out.println(lowerStr.equals(str1)); // false
		
		String UpperStr = str2.toUpperCase();
		System.out.println(UpperStr); // JAVA PROGRAMMING
		System.out.println(UpperStr.equals(str2)); // false		
	}
}


