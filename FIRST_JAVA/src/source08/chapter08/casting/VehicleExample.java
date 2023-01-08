package source08.chapter08.casting;

// 강제 타입 변환 활용
public class VehicleExample {
	public static void main(String[] args) {

		Vehicle vehicle = new Bus();
		vehicle.run();
//		vehicle.checkFare(); // Vehicle 인터페이스에는 checkFare() 메서드가 없음
		
		Bus bus = (Bus)vehicle;  // 강제 타입 변환
		
		bus.run();
		bus.checkFare(); // Bus 클래스에는 checkFare() 메서드가 있음
	}
}


