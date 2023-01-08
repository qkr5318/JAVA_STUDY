package source06.chapter06;

// Page272 인스턴스 멤버(필드, 메서드)와 this
public class Page272_Car {

	// 필드
	String model;
	int speed;
	
	// 생성자
	public Page272_Car(String model) {
		this.model = model;
	}

	// 메서드
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {               // i = i + 10;
		for (int i = 10; i <= 50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속: " + this.speed + "km/h)");
		}
	}	
}
