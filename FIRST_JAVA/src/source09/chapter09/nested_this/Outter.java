package source09.chapter09.nested_this;

// 중첩 클래스에서 바깥 클래스 참조 얻기
public class Outter {

	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			// this : 중첩 객체 참조
			System.out.println(this.field);
			this.method();
			// 바깥 객체(Outter.this) 참조
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}


