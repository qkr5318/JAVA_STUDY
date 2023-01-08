package source06.methodexam;

// 반환값(return값) 유무에 따른 메서드 비교
public class Test09 {

	static void func1() {
		System.out.printf("void형 메서드는 리턴문이 필요 없음.\n");
	}
	
	static int func2() {
		return 100;
	}
	
	public static void main(String[] args) {

		int a;
		
		func1();
		
		a = func2();
		System.out.printf("int형 func2() 메서드에서 return해 준 반환값 ==> %d\n", a);
	}
}
