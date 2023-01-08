package source06.chapter06.access.package1;

public class Base {

	Ace ace;
	
	String name = "김희선";
	private int age = 30;
	
	
	public int getAge() {
		return age;
	}
	
	// 싱글톤 패턴
	private static Base singleton = new Base();
	
	// 생성자
	private Base() {
		System.out.println("싱글톤 패턴 생성자입니다!");
	}
	
	public static Base getInstance() {
		return singleton;
	}
	
	public Base(boolean b) { }  // public 접근 제한 설정
	Base(int b) {  } 		   // default 접근 제한 설정
	private Base(String s) {
		this.name = s;
	}  // private 접근 제한 설정	
	
	// 메서드
	public void method1() {}  // public 접근 제한 설정 메서드 method1() 선언
	void method2() {}  // default 접근 제한 설정 메서드 method2() 선언
	private void method3() {} // private 접근 제한 설정 메서드 method3() 선언

	public static void main(String[] args) {
		Ace ace1 = new Ace();
		System.out.println(ace1.name);
		System.out.println(ace1.getAge());
		
		Ace ace2 = new Ace(false);
		Ace ace3 = new Ace(21);
//		Ace ace4 = new Ace("김다미");
		Base base = new Base("이영애");
		System.out.println(base.name);
		
		Ace m1 = new Ace();
		m1.method1();
		m1.method2();
	}	
}

