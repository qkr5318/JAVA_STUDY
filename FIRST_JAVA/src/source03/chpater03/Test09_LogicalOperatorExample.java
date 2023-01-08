package source03.chpater03;

public class Test09_LogicalOperatorExample {

	public static void main(String[] args) {

		int charCode = 'A';
		
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자군요!");
		}
		System.out.println("65 = " + (char)65); // A
		System.out.println("89 = " + (char)89); // Y
		System.out.println("90 = " + (char)90); // Z
		
		charCode = 'a';
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자군요!");
		}
		System.out.println("97 = " + (char)97);   // a
		System.out.println("122 = " + (char)122); // z
		System.out.println("121 = " + (char)121); // y
		
		charCode = 'A';
		if((charCode<48) && (charCode>57)) {
			System.out.println("0~9 숫자군요!"); // if문이 (false && true)라서, false이기 때문에 화면 출력이 안됨. 
		}	
		
		int value = 6;
		if((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수군요!");
		}
		if((value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수군요!");
		}
	}
}
