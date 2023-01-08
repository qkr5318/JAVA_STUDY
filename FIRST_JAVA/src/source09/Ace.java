package source09;

// 외부클래스(Outter Class) Ace 정의
public class Ace {

	public Ace() {
		System.out.println("@ Ace 객체가 생성됨!");
	}
	
	// 외부클래스(Outter Class)의 내부 인스턴스 맴버 클래스 Base 정의
	public class Base{
		
		int field1;
//		static int field2;
		public Base() {
			System.out.println("&& Base 객체가 생성됨!");
		}
		void method1() {
			System.out.println("☆ method1() 메서드 실행 " + "field1 값 : " + field1);
		}
//		static void method2() {	}
	}

	// static 정적 멤버 클래스
	static class Case{
		
		int field1;
		static int field2;		
		public Case() {
			System.out.println("● Case 객체가 생성됨!");
		}
		void method1() {
			System.out.println("§ static class Case method1() 메서드 실행 " + "field1 값 : " + field1);
		}
		static void method2() {
			System.out.println("◎ static class Case static method2() 메서드 실행 " + "static field2 값 : " + field2);
		}
	}

	// 로컬 클래스 Db 정의
	void method() {
		class Db{
			int field1;
			public Db() {
				System.out.println("◆ Db 객체가 생성됨!");
			}
//			static int field2;
			void method1() {
				System.out.println("▲ 로컬 클래스 D의 method1() 메서드 실행!");
			}
//			static void method2();
		}
		Db db = new Db(); // ◆ Db 객체가 생성됨!
		db.method1();     // ▲ 로컬 클래스 D의 method1() 메서드 실행!
	}
}






