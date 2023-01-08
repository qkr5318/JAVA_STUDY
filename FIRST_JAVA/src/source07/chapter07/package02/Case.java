package source07.chapter07.package02;

import source07.chapter07.package01.Ace;

public class Case extends Ace{

	// Case 클래스는 Ace 클래스와 다른 패키지에 있습니다.
	// 하지만, Case 클래스는 Ace 클래스의 자식 클래스입니다.
	// 그렇기 때문에 Ace 클래스의 protected 필드, 생성자, 메서드에 접근이 가능합니다.
	// 다만, new 연산자를 사용해서 생성자를 직접 호출할 수는 없고,
	// 자식 생성자에서 super()로 Ace 생성자를 호출해서 활용할 수 있습니다.
	public Case() {
		super();
	}
	
	public void method() {		
		this.field = "value";
		this.method();		
	}	
}
