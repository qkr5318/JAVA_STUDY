package source07;

// 타입 변환을 이용한 다형성 예시
class Vehicle{
	String name = "탈 것";
	
	void whoami() {
		System.out.println("나는 탈 것이다!");
	}
	// static void 형은 메서드 오버라이딩 활용 못함!
    static void move() {
		System.out.println("이동하다!");
	}
}

class Car09 extends Vehicle{
	String name = "자동차";

	@Override
	void whoami() {
		System.out.println("나는 자동차 입니다!");
	}
	
	static void move() {
		System.out.println("달리다!");
	}
}

public class Test09 {
	public static void main(String[] args) {

		Vehicle v = new Car09(); // 업캐스팅
		System.out.println(v.name); // 탈것
		v.whoami(); // 나는 자동차 입니다!
		v.move();
		Vehicle.move();
		Car09.move();
		
		System.out.println("====================================");
		
		Car09 c09 = new Car09();
		System.out.println(c09.name);
		c09.whoami();
		
		Car09.move();
		Vehicle.move();
		Car09.move();
		
		System.out.println("====================================");
		
		Vehicle vehicle = new Vehicle();
		vehicle.whoami();
		
		System.out.println("====================================");
		
		Vehicle vehicle1 = new Car09();
		Car09 car09 = (Car09) vehicle1;
		car09.whoami();		
	}
}
