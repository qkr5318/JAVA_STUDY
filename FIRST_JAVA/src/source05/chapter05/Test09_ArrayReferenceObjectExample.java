package source05.chapter05;

public class Test09_ArrayReferenceObjectExample {

	public static void main(String[] args) {

		String[] strArray = new String[4];
//		System.out.println(strArray);
//		System.out.println(strArray[0]);
//		System.out.println(strArray[1]);
//		System.out.println(strArray[2]);
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		strArray[3] = new String("java");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
		System.out.println(strArray[0].equals(strArray[3]));
		System.out.println(strArray[0].equalsIgnoreCase(strArray[3]));
	}

}
