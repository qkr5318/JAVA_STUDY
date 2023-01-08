package source06.chapter06.access.package1;

class Ace {  // default 접근 제한자

	// 필드
	String name = "장나라";
	private int age = 21;
	
	public int getAge() {
		return age;
	}	
	
	// 생성자
	public Ace() {
		
	}
	public Ace(boolean b) { }  // public 접근 제한 설정
	Ace(int b) {  } 		   // default 접근 제한 설정
	private Ace(String s) { }  // private 접근 제한 설정
	
	
	// 메서드
	public void method1() {}  // public 접근 제한 설정 메서드 method1() 선언
	void method2() {}  // default 접근 제한 설정 메서드 method2() 선언
	private void method3() {} // private 접근 제한 설정 메서드 method3() 선언
	
    public static void main(String[] args) {
		Ace a1 = new Ace(true);
		Ace a2 = new Ace(7);
		Ace a3 = new Ace("장나라");
		
		Ace m1 = new Ace();
		m1.method1();
		m1.method2();
		m1.method3();
	}
}
