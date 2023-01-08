package source11.chapter11;

public class StringEqualsExample {
	public static void main(String[] args) {

		String strVar1 = new String("장나라");
		System.out.println(strVar1.hashCode());
		String strVar2 = "장나라";
		System.out.println(strVar2.hashCode());
		
		if (strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조합니다!");
		} else {
			System.out.println("다른 String 객체를 참조합니다!");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가집니다!");
		} else {
			System.out.println("다른 문자열을 가집니다!");
		}
	}
}



