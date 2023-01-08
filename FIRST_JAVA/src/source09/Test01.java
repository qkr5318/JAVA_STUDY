package source09;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("★ Test01 클래스의 main() 실행 함수 동작 확인!");
		
		Ace ace = new Ace();
		
		// 인스턴스 멤버 클래스 객체 생성
		Ace.Base base = ace.new Base();
		base.field1 = 3;
		base.method1();
		
		// static 정적 멤버 클래스 객체 생성
		Ace.Case aceCase = new Ace.Case();
		aceCase.field1 = 5;
		aceCase.method1();
		
		Ace.Case.field2 = 7;
		Ace.Case.method2();
		
		// 로컬 클래스 객체 생성을 위한 메서드 호출
		ace.method();
	}

}






