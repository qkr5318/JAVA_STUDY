package source08;

interface Animal4{
	void cry();
	default void move() {
		System.out.println("동물이 움직입니다~");
	} 
	static void breathe() {
		System.out.println("동물이 숨을 쉽니다!");		
	}
}
interface Cat4 extends Animal4{
	
	

	@Override
	default void cry() {
		System.out.println("고양이가 냐옹 냐옹~ 합니다!");		
	}
	@Override
	default void move() {		
		System.out.println("고양이가 움직입니다!");
	}	
}

class MyPet implements Cat4{

	@Override
	public void cry() {
		System.out.println("애완 냥이가 소리를 냅니다~");
	}
}

public class Test01_04 {
	public static void main(String[] args) {

		MyPet mypet = new MyPet();
		mypet.cry();	// 인터페이스의 default 메서드 활용
		
		Animal4.breathe(); // 인터페이스의 static 메서드 활용
	}
}



