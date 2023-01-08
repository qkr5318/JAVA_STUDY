package source06.chapter06;

// Car 클래스 필드 선언
public class Car {

	// 필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정색";
	int maxSpeed = 350;
	int speed;
	int cc;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String color, int cc) {
		this.color = color;
		this.cc = cc;
	}
	
}
