package source08;

interface Animal1{
	void cry();
}

interface Pet{
	void play();
}

class Cat1 implements Animal1, Pet{

	@Override
	public void play() {
		System.out.println("냥이야~ 산책가자~");
	}

	@Override
	public void cry() {
		System.out.println("소리를 지른다! 냐옹~ 냐옹~ ");
	}
}

class Dog1 implements Animal1, Pet{

	@Override
	public void play() {
		System.out.println("공놀이 하자~");
	}

	@Override
	public void cry() {
		System.out.println("소리를 지른다! 멍멍~");
	}	
}

public class Test01_02 {
	public static void main(String[] args) {

		Cat1 cat1 = new Cat1();
		cat1.play();
		cat1.cry();
		System.out.println("=========================");
		Dog1 dog1 = new Dog1();
		dog1.play();
		dog1.cry();
	}
}


