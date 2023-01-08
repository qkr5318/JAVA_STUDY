package source08;

interface Animal5{
	void sound();
}

class Dog5 implements Animal5{

	@Override
	public void sound() {
		System.out.println("강아지가 멍멍~~ 합니다!");
	}	
}
class Cuckoo implements Animal5{

	@Override
	public void sound() {
		System.out.println("뻐꾹이가 뻐꾹~ 뻐꾹~ 합니다!");		
	}	
}

public class Test03 {
	public static void main(String[] args) {

		Dog5 dog5 = new Dog5();
		dog5.sound();
		Cuckoo cuckoo = new Cuckoo();
		cuckoo.sound();
		System.out.println("=============================");
		
		makeSound(dog5);
		makeSound(cuckoo);		
	}

	 static void makeSound(Animal5 animal5) {
		animal5.sound();		
	}
}
