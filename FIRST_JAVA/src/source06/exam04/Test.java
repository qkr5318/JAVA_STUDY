package source06.exam04;

class Car{
	private String color;
	private int speed;
	
	public Car() {
	
	}

	public Car(String color) {
		this.color = color;
	}

	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}	
}


public class Test {

	public static void main(String[] args) {

		// 인스턴스 객체를 만들때 모두 다른 생성자 constructor를 호출해 봅니다.
		Car myCar1 = new Car();
		System.out.println(myCar1.getColor());
		
		Car myCar2 = new Car("붉은색");
		System.out.println(myCar2.getColor());
		
		Car myCar3 = new Car("푸른색", 70);
		System.out.println(myCar3.getColor() + ", " + myCar3.getSpeed());
		
		
	}

}
