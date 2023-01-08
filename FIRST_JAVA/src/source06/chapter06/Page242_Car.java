package source06.chapter06;

// Page242 : 다른 생성자를 호출해서 중복 코드 줄이기
public class Page242_Car {

	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	public Page242_Car() {  // 디폴트(기본) 생성자
	}

	Page242_Car(String model){
		this(model, "은색", 250);
	}
	
	Page242_Car(String model, String color){
		this(model, color, 250);
	}
	
	Page242_Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;		
	}
}
