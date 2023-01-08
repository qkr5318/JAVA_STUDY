package source06.chapter06;

// 정적 메소드(static method) 선언 시 주의할 점
public class Page278_Car {

	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Page278_Car myCar = new Page278_Car();
		myCar.speed = 60;
		myCar.run();
	}
}
