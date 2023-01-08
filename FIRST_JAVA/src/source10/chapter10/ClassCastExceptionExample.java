package source10.chapter10;

class Animal {
	void cry() {
		System.out.println("동물은 소리를 냅니다!");
	}
}

class Cat extends Animal {

	@Override
	void cry() {
		System.out.println("고양이가 야옹~ 소리를 냅니다!");
	}
	
}

class Dog extends Animal {

	@Override
	void cry() {
		System.out.println("강아지가 멍멍~ 소리를 냅니다!");
	}		
}

public class ClassCastExceptionExample {

	public static void main(String[] args) {

		Animal animal = new Dog();
		changeDog(animal);
		
		Animal animal1 = new Cat();
		changeDog(animal1);
	}

	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
			System.out.println("changeDog - dog 타입 변환 성공!");
			dog.cry();
			
		} else if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
			System.out.println("changeDog - cat 타입 변환 성공!");
			cat.cry();
		}
	}
	
}

