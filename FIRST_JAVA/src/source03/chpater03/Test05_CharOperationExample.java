package source03.chpater03;

public class Test05_CharOperationExample {

	public static void main(String[] args) {

		char c1 = 'A' + 1; // char c1 = 66; 컴파일됨
		System.out.println("c1 = " + c1); // 'B'
		System.out.println("c1 = " + (int)c1); // 66
		char c2 = 'A';
		System.out.println("c2 = " + c2); // 'A'
		System.out.println("c2 = " + (int)c2); // 65
//		char c3 = c2 + 1;
		int c3 = c2 + 1;
		System.out.println("c3 = " + c3); // 66
		System.out.println("c3 = " + (char)c3); // 'B'	
	}
}
