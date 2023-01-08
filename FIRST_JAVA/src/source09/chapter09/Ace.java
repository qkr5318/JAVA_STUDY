package source09.chapter09;

// 바깥 클래스(Outer Class) Ace 생성
class Ace {

	public Ace() {
		System.out.println("Ace 객체가 생성됨!");
	}
	
	// 인스턴스 멤버 클래스 Base 생성
	class Base{
		public Base() {
			System.out.println("Base 객체가 생성됨!");
		}
		int field1;
//		static int field2;
		void method1() {
			System.out.println("Base 객체의 method1() 메서드가 실행됨!");
		}
//		static void method2() {}
	}
	
	// static 멤버 클래스 Case 생성
	static class Case{
		public Case() {
			System.out.println("static 멤버 클래스 Case 객체가 생성됨!");
		}
		int field1;
		static int field2;
		void method1() {
			System.out.println("Case 객체의 method1() 메서드가 실행됨!");
		}
		static void method2() {
			System.out.println("Case 객체의 static method2() 실행됨!");
		}
	}
	
		void method() {
			// method() 메서드의 로컬 클래스 Db 생성
			class Db{
				public Db() {
					System.out.println("로컬 클래스 Db 객체가 생성됨!");
				}
				int field1;
//				static int field2;
				void method1() {
					System.out.println("Db 객체의 method1() 메서드가 실행됨!");
				}
//				static void method2() {	}
			}
			Db db = new Db();
			db.field1 = 3;
			db.method1();
		}
	}
