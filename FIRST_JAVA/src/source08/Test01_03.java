package source08;

interface Animal3{
	public void cry();
}

interface Mamma{
	public void move();
}

class Pet3{
	public void play() {
		System.out.println("놀이를 합니다~");
	}
}

class Cat3 extends Pet3 implements Animal3, Mamma{

	@Override
	public void cry() {
		System.out.println("고양이가 소리를 냅니다~");		
	}

	@Override
	public void move() {
		System.out.println("고양이가 움직입니다~");		
	}	
}

public class Test01_03 {
	public static void main(String[] args) {

		Cat3 cat3 = new Cat3();
		cat3.cry();
		cat3.play();
		cat3.move();
	}
}
