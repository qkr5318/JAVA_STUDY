package source07.abstractex;

public class AnimalExmaple {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("==================");
		
		// 변수의 자동 타입 변환
		Animal animall = null;
		animall = new Dog(); // 자동 타입 변환
		animall.sound();     // 재정의된 메서드 호출
		animall = new Cat(); // 자동 타입 변환
		animall.sound();     // 재정의된 메서드 호출
		System.out.println("===================");
		
		// 메서드의 다형성 활용
		animalSound(new Dog());  // 자동 타입 변환
		animalSound(new Cat());  // 자동 타입 변환
	}

	public static void animalSound(Animal animal) {
		animal.sound(); // 재정의된 메서드 호출		
	}
}
