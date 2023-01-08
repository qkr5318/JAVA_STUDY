package source06.exam02;

// private 접근 제어 수식어 활용
class Car{
	String color;
	private int speed;	
	
	public Car() {
	
	}
	
	void upSpeed(int value) {
		this.speed = speed + value;
		System.out.println("현재 속도는 " + speed + "입니다!");
	}

	public int getSpeed() {
		System.out.println("getSpeed() 메서드가 실행됩니다!");
		return speed;		
	}

	public void setSpeed(int speed) {
		System.out.println("setSpeed() 메서드가 실행됩니다!");
		this.speed = speed;
	}	
	
}


public class Test {
	public static void main(String[] args) {
	
		Car myCar = new Car();
		myCar.color = "붉은색";
		myCar.upSpeed(100);
		myCar.setSpeed(150);
		int num = myCar.getSpeed();
		System.out.println("myCar의 색상은 " + myCar.color + "이며, " + "현재 속도는 " + num + "km/h 입니다!");
		
	}	
}
