package source06.chapter06;

// 클래스 외부에서 메소드 호출
public class Page262_Car {

	// 필드
	int speed;

	
	// 기본(디폴트) 생성자

	// 메서드
	public int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다!");
	}
	
	void run() {
		for (int i = 10; i <= 50; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속 : " + speed + "km/h)");
		}
	}
}
