package source07.abstract_review;

public class AnimalExample {
	public static void main(String[] args) {

		Dog dog1 = new Dog();
		dog1.sound();
		
		Cat cat1 = new Cat();
		cat1.sound();
		
		System.out.println("========================");
		
		// 추상 클래스 Animal 타입의 인스턴스 객체를 직접 생성할 수는 없음
//		Animal ani = new Animal();
		
		// 변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog(); // 자동 타입 변환 및 재정의된 sound() 메서드 호출 처리함
		animal.sound();
		
		animal = new Cat();
		animal.sound();		
		System.out.println("========================");
		
		// 메서드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) {
		animal.sound();	
	}
}
