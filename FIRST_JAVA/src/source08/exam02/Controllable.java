package source08.exam02;

//전자 제품 제어 활용을 위해 Controllable 인터페이스 생성
public interface Controllable { 
	
	void turnOn();
	
	void turnOff();
	
	default void repair() {
		System.out.println("전자 제품 장비를 수리한다.");
	}
	
	static void reset() {
		System.out.println("전자 제품 장비를 초기화한다.");
	}
}


