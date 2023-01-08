package source08.chapter08.typecheck;

public class Driver {

	public void drive(Vehicle vehicle) {
		// vehicle 매개 변수가 참조하는 객체가 Bus 타입인지 체크함
		if(vehicle instanceof Bus) {			
			System.out.println(vehicle instanceof Bus);
			// 앞서 Bus 타입 체크에서 true일 경우, 안전하게 강제 타입 변환 처리함
			Bus bus = (Bus) vehicle;
	// Bus 타입으로 강제 타입 변환을 하게 되어 checkFare() 메서드를 사용할 수 있게 되었음
			bus.checkFare();
		}
		vehicle.run();
	}
}

