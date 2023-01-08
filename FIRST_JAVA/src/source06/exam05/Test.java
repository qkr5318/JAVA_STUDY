package source06.exam05;

// static 변수(class 변수) 활용
class Car{
	String color;
	int speed;
	
	static int count = 0;
	
	public Car() {
		count++;
	}
}

public class Test {
	public static void main(String[] args) {

		Car myCar1 = new Car();
		System.out.println("현재 생산된 자동차 대수 ==> " + myCar1.count);
		Car myCar2 = new Car();
		System.out.println("현재 생산된 자동차 대수 ==> " + myCar2.count);
		
		Car myCar3 = new Car();
		System.out.println("현재 생산된 자동차 대수 ==> " + Car.count);		
	}

}
