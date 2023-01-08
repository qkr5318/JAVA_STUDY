package source07.chapter07.polymorphism;

public class Car {

	// 필드 : 자동차는 4개의 타이어를 가짐
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	// 생성자
	
	// 메서드 : 모든 타이어를 1회 회전시키기 위해 각 Tire 객체의 roll() 메서드를 호출함. false를 리턴하는 roll()이 있을 경우, stop() 메서드를 호출하고 해당 타이어 번호를 리턴 처리함.
	int run() {
		 System.out.println("[자동차가 달립니다]");
		 if(frontLeftTire.roll()==false) {
			 stop();
			 return 1;
		 }
		 if(frontRightTire.roll()==false) {
			 stop();
			 return 2;
		 }
		 if(backLeftTire.roll()==false) {
			 stop();
			 return 3;
		 }
		 if(backRightTire.roll()==false) {
			 stop();
			 return 4;
		 }
		return 0;
		
	}

	void stop() {
		System.out.println("[자동차가 멈춥니다]"); // 타이어가 펑크(동작하지 않을때) 났을 때 실행함		
	}	
}
