package source02;

public class Test02_01 {
	public static void main(String[] args) {
		System.out.printf("%d\n", 123);
		System.out.printf("%5d\n", 123);
		System.out.printf("%05d\n", 123);
		
		System.out.printf("%f\n", 123.45);
		System.out.printf("%7.1f\n", 123.45);
		System.out.printf("%7.3f\n", 123.45);
		
		System.out.printf("%s\n", "Hi~ Jangnara!");
		System.out.printf("%15s\n", "Hi~ Jangnara!");
	}
}

//  실행 결과
//	123
//	123
//	00123
//	123.450000
//	123.5
//	123.450
//	Hi~ Jangnara!
//	Hi~ Jangnara!