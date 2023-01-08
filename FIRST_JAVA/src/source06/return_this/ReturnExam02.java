package source06.return_this;

// 클래스의 메서드를 종류별로 생성하고 접근하는 예시

class Method{
	int a = 10;
	int b = 20;
	int add() {
		return a + b;
	}
	
	static int c = 70;
	static int add(int x, int y) {
		return x + y;		
	}
}

public class ReturnExam02 {
	public static void main(String[] args) {

		System.out.println(Method.add(20, 30));
		System.out.println(Method.c);
		
		Method myMethod = new Method();		
		System.out.println(myMethod.add());		
	}
}
