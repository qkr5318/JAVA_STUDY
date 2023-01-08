package source16_lambda;

//  람다식 = 함수형 프로그래밍 활용

interface PrintString{
	void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		
		PrintString lambdaStr = s -> System.out.println(s); // 람다식을 변수에 대입 처리함
		
		lambdaStr.showString("Hi~ Jangnara!");
		
		showMyString(lambdaStr); // 메서드 매개변수로 전달 처리함
		
		PrintString reStr = returnString();
		reStr.showString("hello~ ");
	}

	public static PrintString returnString() {  // 반환 값으로 사용
		return s -> System.out.println(s + "world");
	}

	public static void showMyString(PrintString p) {
		p.showString("Have a Nice day~");		
	}
}


