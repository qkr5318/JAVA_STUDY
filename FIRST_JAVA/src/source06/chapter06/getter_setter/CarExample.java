package source06.chapter06.getter_setter;

public class CarExample {
	public static void main(String[] args) {

		Car myCar = new Car();
		
		// 잘못된 속도로 변경 처리해 봄
		myCar.setSpeed(-50);
		System.out.println("현재 속도 = " + myCar.getSpeed());
		
		// 올바른 속도로 변경 처리해 봄
		myCar.setSpeed(70);
		System.out.println("현재 속도 = " + myCar.getSpeed());
		
		// 멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);			
		}
		System.out.println("현재 속도 = " + myCar.getSpeed());
	}
}
