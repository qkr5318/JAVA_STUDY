package source05.chapter05;

public class Test02_StringEqualsExample2 {
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
		
		String [] array = new String[3];
		array[0] = "일";
		array[1] = "이";
		array[2] = "삼";
		
		String strVar5 = new String("일");
//		String strVar5 = "일";
		if(array[0] == strVar5) {
			System.out.println("array[0]과 strVar5는 참조 주소값이 같음!");
		} else {
			System.out.println("array[0]과 strVar5는 참조 주소값이 다름!");
		}
		if(array[0].equals(strVar5)) {
			System.out.println("array[0]과 strVar5는 문자열이 같음!");
		}
	}
	
}
