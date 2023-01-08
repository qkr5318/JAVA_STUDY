package source06.chapter06;

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		System.out.println("싱글톤 객체 생성자입니다!");
	}
	
	static Singleton getInstance() {
		return singleton;
	}
}
