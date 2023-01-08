package source06.chapter06;

// Page273 : 인스턴스 멤버(필드, 메서드)와 this
public class Page273_CarExample {

	public static void main(String[] args) {

		Page272_Car myCar = new Page272_Car("포르쉐");
		myCar.run();
		
		Page272_Car yourCar = new Page272_Car("벤츠");
		yourCar.run();
	}

}
