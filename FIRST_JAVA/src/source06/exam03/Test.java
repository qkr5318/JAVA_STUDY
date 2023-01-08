package source06.exam03;

// 매개변수(Parameter, 파라미터)가 있는 constructor 생성자 활용
class Car{
	private String color;
	private int speed;
	
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

		Car myCar1 = new Car("붉은색", 50);
		System.out.println("myCar1의 색상은 " + myCar1.getColor() + "이며, 현재 속도는 " + myCar1.getSpeed() + "km/h입니다!");
		Car myCar2 = new Car("푸른색", 100);
		System.out.println("myCar2의 색상은 " + myCar2.getColor() + "이며, 현재 속도는 " + myCar2.getSpeed() + "km/h입니다!");		
	}

}
