package source06.chapter06;

public class Page239_Car {

	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	public Page239_Car() {  // 디폴트(기본) 생성자
	}

	// Page239 : model값을 매개변수로 받는 생성자
	public Page239_Car(String model) { 
		this.model = model;
	}
	

	// model값과 color값을 매개변수로 받는 생성자 
	public Page239_Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	// model값과 color값, maxSpeed값을 매개변수로 받는 생성자
	public Page239_Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

