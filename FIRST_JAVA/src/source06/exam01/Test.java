package source06.exam01;

class Car{
	String color;
	int speed;
	
	int upSpeed(int value) {
		this.speed += value; // this.speed = speed + value;
		if(speed > 200) {
			speed = 200;
		}
		return speed;
	}
	
	int downSpeed(int value) {
		this.speed -= value; // this.speed = speed - value;
		if(speed < 0 ) {
			speed = 0;
		}
		return speed;		
	}	
}

public class Test {

	public static void main(String[] args) {

		Car myCar = new Car();
		int currentSpeed = myCar.upSpeed(50);
		System.out.println("myCar의 현재 속도는 " + currentSpeed + "입니다!");
		
		Car yourCar = new Car();
		yourCar.upSpeed(100);
		String str = yourCar.color = "붉은색";
		int currentSpeed3 = yourCar.downSpeed(30);
		System.out.println("your의 자동차 색상은 " + str + "이고, " + "현재 속도는 " + currentSpeed3 + "입니다!");		
	}
}
