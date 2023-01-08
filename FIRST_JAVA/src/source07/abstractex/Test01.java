package source07.abstractex;

abstract class Animal01{
	abstract void cry();
}

class Cat01 extends Animal01{

	@Override
	void cry() {
		System.out.println("나는 고양이다! 냐옹~ 냐옹~~ ^-^!");		
	}	
}

class Dog01 extends Animal01{

	@Override
	void cry() {
		System.out.println("나는 강아지다! 멍멍~ 멍멍~~ ^-^/");		
	}	
}

public class Test01 {
	public static void main(String[] args) {

		// 추상 클래스 Animal01은 직접 인스턴스를 생성할 수 없음.
//		Animal01 animal01 = new Animal01;
		Cat01 cat01 = new Cat01();
		cat01.cry();
		
		Dog01 dog01 = new Dog01();
		dog01.cry();		
	}
}




