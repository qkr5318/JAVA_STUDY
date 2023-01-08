package source06.chapter06;

// 클래스 외부에서 메소드 호출
public class Page262_CarExample {

	public static void main(String[] args) {

		Page262_Car myCar = new Page262_Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도 = " + speed + "km/h");
		
	}
}
