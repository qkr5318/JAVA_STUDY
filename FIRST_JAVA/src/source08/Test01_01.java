package source08;

interface Animal{
	void cry(); // 추상 메서드 cry() 선언
}

class Cat implements Animal{

	@Override
	public void cry() {
		System.out.println("소리를 지른다. 냐옹~ 냐옹~");		
	}	
}

class Dog implements Animal{

	@Override
	public void cry() {
		System.out.println("소리를 지른다. 멍멍~ 멍멍~");		
	}	
}

public class Test01_01 {
	public static void main(String[] args) {
			Cat cat = new Cat();
			cat.cry();
			
			Dog dog = new Dog();
			dog.cry();		
	}
}





