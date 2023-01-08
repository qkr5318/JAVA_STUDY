package source09.chapter09.member_use;

// 멤버 클래스에서 사용 제한 활용 예시
public class A {

	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 20;
			method2();
		}
	}
	
	static class C{
		void method() {
//			field1 = 10; // 인스턴스 필드를 참조할 수 없음
//			method1();   // 인스턴스 메서드를 참조할 수 없음
			
			field2 = 30;
			method2();
		}
	}
}





