package source06.return_this;

class Car{
	private String color;
	private int speed;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	
	void downSpeed(int value) {
		speed = speed - value;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}	
	
}


public class ThisExam {

	public static void main(String[] args) {

		Car myCar1 = new Car();
		myCar1.setColor("붉은색");
		System.out.println("myCar1 자동차의 색상은 " + myCar1.getColor() + "입니다!");
		
		myCar1.upSpeed(30);
		System.out.println("myCar1 자동차의 현재 속도는 " + myCar1.getSpeed() + "km/h 입니다!");
		
		myCar1.downSpeed(20);
		System.out.println("myCar1 자동차의 현재 속도는 " + myCar1.getSpeed() + "km/h 입니다!");
		
	}

}


