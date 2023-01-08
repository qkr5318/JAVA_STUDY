package source07.chapter07.polymorphism;

public class ChildExample {

	public static void main(String[] args) {

		
		Child child = new Child();
		
		Parent parent = child; // 자동 타입 변환 처리됨
		
		parent.method1();
		parent.method2(); // 재정의된(오버라이딩, overriding) 메서드가 호출됨.
//		parent.method3();
		
	}

}
