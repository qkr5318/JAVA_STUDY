package source06.methodexam;

// 지역 변수와 전역 변수 비교
public class Test08 {

	static int a = 100;
	
	static void func1() {
		int a = 200;
		System.out.printf("func1()에서 a의 값 ==> %d\n", a);
	}
	
	public static void main(String[] args) {

		func1();
		System.out.printf("main()에서 a의 값 ==> %d\n", a);
	}
}
