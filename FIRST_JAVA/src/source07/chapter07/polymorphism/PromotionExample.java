package source07.chapter07.polymorphism;

class A {}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
//		b b2 = e; // 상호 상속 관계에 있지 않기 때문에 컴파일 에러가 발생함
//		C c2 = d; // 상호 상속 관계에 있지 않기 때문에 컴파일 에러가 발생함
	}	
}

