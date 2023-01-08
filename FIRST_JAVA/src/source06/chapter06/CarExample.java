package source06.chapter06;

// 외부 클래스(CarExample 클래스)에서 Car 클래스의 필드값 읽기와 변경하기
public class CarExample {
	public static void main(String[] args) {

		// myCar 인스턴스 객체 생성
		Car myCar = new Car();
		Car myCar2 = new Car();
		
		Car myCar3 = new Car("파란색", 3000);
		System.out.println("myCar3 자동차의 색상 = " + myCar3.color);
		System.out.println("myCar3 자동차의 cc = " + myCar3.cc);
		
		//  필드값 읽어오기
		System.out.println("제작 회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		// 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 인스턴스 객체 myCar의 속도 = " + myCar.speed);
		
		myCar2.speed = 100;
		System.out.println("수정된 인스턴스 객체 myCar2의 속도 = " + myCar2.speed);
	}
}
