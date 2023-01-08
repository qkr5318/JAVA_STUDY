package source05.chapter05;

public class Test01_StringEqualsExample {
	public static void main(String[] args) {

		String strVar1 = "장나라";
		String strVar2 = "장나라";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조값이 같음!");
		} else {
			System.out.println("strVar1과 strVar2는 참조값이 다름!");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음!");
		}
		
		String strVar3 = new String("장나라");
		String strVar4 = new String("장나라");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조값이 같음!");
		} else {
			System.out.println("strVar3과 strVar4는 참조값이 다름!");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음!");
		}
	}
	
}
